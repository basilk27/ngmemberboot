package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.JxfXref;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class)
@DataJpaTest
public class JxfXrefRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private JidJobidRepository jidJobidRepository;

    @Autowired
    private JxfXrefRepository jxfXrefRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Sql( { "/sqlscripts/jxfxrefschema.sql", "/sqlscripts/jxfxrefdata.sql" } )
    public void WhenFindBySystemType_And_JobId_And_EffectiveDate() {

        //given
        String jobId = "BMK01";

        //when
        List<JidJobid> jidJobidList = jidJobidRepository.findJidJobidsById_CmsSrcSysCdAndAndId_JidJobIdAndJidJobidStatCd(
                                                Constants.WGS20_CMS_SYSTEM_CODE, jobId, Constants.ACTIVE_JOBID_STATUS );

        JidJobid jidJobid = jidJobidList
            .stream()
            .max( Comparator.comparing( JidJobid::getModifyDtTm ))
            .orElseThrow( NoSuchElementException::new );

        List<JxfXref> jxfXrefList = jxfXrefRepository
                .findJxfXrefsById_CmsSrcSysCdAndAndJidJobIdAndIdJxfEfctvDtGreaterThanEqual(
                                        jidJobid.getId().getCmsSrcSysCd(), jidJobid.getId().getJidJobId(),
                                        jidJobid.getId().getJidEfctvDt() );

        //then
        assertThat( jxfXrefList.size() ).isEqualTo( 4 );
    }

    @Test
    @Sql( { "/sqlscripts/jxfxrefschema01.sql", "/sqlscripts/jxfxrefdata01.sql" } )
    public void WhenFindBySystemType_And_JobId_TheReturnJxfXrefList() {

        //given
        String jobId = "BMK01";
        String sourceSystem = "WGS20";

        //when
        List<JxfXref> jxfXrefList = jxfXrefRepository.findJxfXrefsById_CmsSrcSysCdAndAndJidJobId(sourceSystem, jobId);

        //then
        assertThat( jxfXrefList.size() ).isEqualTo( 4 );
    }
}