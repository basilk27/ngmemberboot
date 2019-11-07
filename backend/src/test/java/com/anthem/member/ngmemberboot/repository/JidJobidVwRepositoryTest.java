package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.dto.ClientIdWithDescriptionDTO;
import com.anthem.member.ngmemberboot.model.JidJobidPK;
import com.anthem.member.ngmemberboot.model.JidJobidVw;
import com.anthem.member.ngmemberboot.model.TypCdVw;
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
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class)
@DataJpaTest
public class JidJobidVwRepositoryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private JidJobidVwRepository jidJobidVwRepository;

    @Test
    @Sql( { "/sqlscripts/jidjobidvwschema.sql", "/sqlscripts/jidjobidvwdata.sql" } )
    public void whenFindBySystemType_And_ActiveStatus_thenReturnClientIdWithDescriptionDTO_List() {
        //given
        Instant instant = Instant.now();

        //when
        List<ClientIdWithDescriptionDTO> clientList = jidJobidVwRepository
                .findByClientIdWithDescriptionDTO( Constants.WGS20_CMS_SYSTEM_CODE, Constants.ACTIVE_JOBID_STATUS);

        //then
        assertThat( clientList.isEmpty() ).isFalse();
        assertThat( clientList.size() ).isEqualTo( 1 );

        clientList.forEach( System.out::println );

    }

    @Test
    @Sql( { "/sqlscripts/jidjobidvwschema01.sql", "/sqlscripts/jidjobidvwdata01.sql" } )
    public void whenFindBySourceSystemAndJobId_thenReturnJidJobidVw_List() {
        //given
        String strJobID = "0F";

        //when
        List<JidJobidVw> clientList = jidJobidVwRepository.findById_CmsSrcSysCdAndId_JidJobId( Constants.WGS20_CMS_SYSTEM_CODE, strJobID );

        //then
        assertThat( clientList.isEmpty() ).isFalse();
        assertThat( clientList.size() ).isEqualTo( 3 );

        clientList.forEach( System.out::println );
    }

    @Test
    @Sql( { "/sqlscripts/jidjobidvwschema02.sql", "/sqlscripts/jidjobidvwdata01.sql" } )
    public void whenFindMaxEffectiveDate_From_theReturnJidJobidVw_List() {
        //given
        String strJobID = "0F";

        //when
        List<JidJobidVw> clientList = jidJobidVwRepository.findById_CmsSrcSysCdAndId_JidJobId( Constants.WGS20_CMS_SYSTEM_CODE, strJobID );

        //then
        assertThat( clientList.isEmpty() ).isFalse();
        assertThat( clientList.size() ).isEqualTo( 3 );

        clientList.forEach( System.out::println );

        JidJobidVw jidJobidVw = clientList
                .stream()
                .max( Comparator.comparing( JidJobidVw::getModifyDtTm ))
                .orElseThrow( NoSuchElementException::new );

        System.out.println( jidJobidVw );
    }
}