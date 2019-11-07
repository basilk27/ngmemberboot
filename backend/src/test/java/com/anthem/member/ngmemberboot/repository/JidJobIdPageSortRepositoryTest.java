package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.JidJobIdPageSort;
import com.anthem.member.ngmemberboot.model.JidJobid;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith( SpringRunner.class)
@DataJpaTest
public class JidJobIdPageSortRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private JidJobIdPageSortRepository jidJobIdPageSortRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    @Sql( { "/sqlscripts/jidjobidschema.sql", "/sqlscripts/jidjobiddata02.sql" } )
    public void whenFindAllBySystemType_And_ActiveStatus_thenReturnJidJobid_List() {
        //given
        PageRequest pageRequest01 = PageRequest.of( 0, 4, Sort.by( "jidJobId" ).ascending() );

        PageRequest pageRequest02 = PageRequest.of( 1, 4, Sort.by( "jidJobId" ).ascending() );

        //when
        List<JidJobIdPageSort> jobIdPageSortOptional01 = jidJobIdPageSortRepository
                .findAllByCmsSrcSysCdAndJidJobidStatCd( Constants.WGS20_CMS_SYSTEM_CODE,
                                                        Constants.ACTIVE_JOBID_STATUS,
                                                        pageRequest01 );

        //then
        assertThat( jobIdPageSortOptional01.isEmpty() ).isFalse();
        jobIdPageSortOptional01.forEach( j ->
            System.out.println( j.getJidJobId() + "   " + j.getCmsSrcSysCd() + "   " + j.getJidJobidStatCd() ) );

        //when
        List<JidJobIdPageSort> jobIdPageSortOptional02 = jidJobIdPageSortRepository
                .findAllByCmsSrcSysCdAndJidJobidStatCd( Constants.WGS20_CMS_SYSTEM_CODE,
                                                        Constants.ACTIVE_JOBID_STATUS,
                                                        pageRequest02 );

        //then
        assertThat( jobIdPageSortOptional02.size() ).isEqualTo( 2 );
        jobIdPageSortOptional02.forEach( j ->
            System.out.println( j.getJidJobId() + "   " + j.getCmsSrcSysCd() + "   " + j.getJidJobidStatCd() ) );
    }
}