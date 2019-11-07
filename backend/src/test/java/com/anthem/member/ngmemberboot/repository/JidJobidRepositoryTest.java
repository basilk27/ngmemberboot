package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.JidJobidPK;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class)
@DataJpaTest
public class JidJobidRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private JidJobidRepository jidJobidRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Sql( { "/sqlscripts/jidjobidschema.sql", "/sqlscripts/jidjobiddata.sql" } )
    public void whenFindBySystemType_And_ActiveStatus_thenReturnClientIdWithDescriptionDTO_List() {
        //given
        String jobId = "BMK01";

        //when
        List<JidJobid> jidJobidList = jidJobidRepository.findJidJobidsById_JidJobId( jobId );

        //then
        assertThat( jidJobidList ).isNotNull();
        assertThat( jidJobidList.size() ).isEqualTo( 3 );
    }

    @Test
    @Sql( { "/sqlscripts/jidjobidschema.sql", "/sqlscripts/jidjobiddata01.sql" } )
    public void whenFindBySystemType_And_JobId_And_ActiveStatus_thenReturnJidJobid_List() {
        //given
        String jobId = "0F";

        //when
        List<JidJobid> jidJobidList = jidJobidRepository.findJidJobidsById_CmsSrcSysCdAndAndId_JidJobIdAndJidJobidStatCd(
                                            Constants.WGS20_CMS_SYSTEM_CODE, jobId, Constants.ACTIVE_JOBID_STATUS );

        //then
        assertThat( jidJobidList ).isNotNull();
    }

    @Test
    @Sql( { "/sqlscripts/jidjobidschema.sql", "/sqlscripts/jidjobiddata.sql" } )
    public void whenFindBySystemType_And_ActiveStatus_thenReturnJidJobid_List() {
        //given
        String jobId = "BMK01";

        //when
        List<JidJobid> jidJobidList = jidJobidRepository
                .findJidJobidsById_CmsSrcSysCdAndAndId_JidJobId( Constants.WGS20_CMS_SYSTEM_CODE, jobId );

        //then
        assertThat( jidJobidList.size() ).isEqualTo( 3 );

        jidJobidList.forEach( jidJobid ->
            System.out.println( jidJobid.getId().getJidJobId() + "   " +
                                jidJobid.getId().getCmsSrcSysCd() + "    " +
                                jidJobid.getJidDescTxt() ) );
    }

    @Test
    @Sql( { "/sqlscripts/jidjobidschema.sql" } )
    public void jidJobidBuilder() {

        //given
        Instant now = Instant.now();

        Timestamp jidEfctvDt = Timestamp.from( now );

        JidJobid jidJobid = new JidJobid.JidJobIdBuilder()
                .id( new JidJobidPK( "BMK4", "WGS20", jidEfctvDt ) )
                .jidTrmntnDt( null )
                .jidJobidStatCd( Constants.ACTIVE_JOBID_STATUS )
                .jidOwnerId( "AF88034" )
                .modifyUsusId( "AF88034" )
                .modifyDtTm( jidEfctvDt )
                .jidDescTxt( "Testing" )
                .build();

        //when
        JidJobid aJidJobid = jidJobidRepository.save( jidJobid );

        //then
        assertThat( aJidJobid ).isNotNull();
        assertThat( aJidJobid.getId().getJidJobId() ).isEqualTo( "BMK4" );
    }
}