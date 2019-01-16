package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.TypCdVw;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith( SpringRunner.class)
@DataJpaTest
public class TypCdVwRepositoryIntegrationTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TypCdVwRepository typCdVwRepository;

    @Test
    @Sql({ "/sqlscripts/typcdvwschema.sql", "/sqlscripts/typcdvwdata.sql" })
    public void whenFindByCdciCdItmId_And_UcfrFltrVal_thenReturnTypCdVw_List() {
        //given
        int cdciCdItmId = 1286;
        String ucfrFltrVal = "EET";

        //when
        List< TypCdVw > typCdVwList = typCdVwRepository.findByCdciCdItmIdAnducfrFltrVal( cdciCdItmId, ucfrFltrVal );

        //then
        assertThat( typCdVwList.isEmpty() ).isFalse();
        assertThat( typCdVwList.size() ).isEqualTo( 2 );

        typCdVwList.forEach( i -> System.out.println( i ));
    }
}
