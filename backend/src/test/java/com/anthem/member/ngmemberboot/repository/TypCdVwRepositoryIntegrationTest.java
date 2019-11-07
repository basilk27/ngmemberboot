package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.dto.SystemSource;
import com.anthem.member.ngmemberboot.dto.TransformedTypCd;
import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.model.TypCdVwKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
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
        List< TypCdVw > typCdVwList = typCdVwRepository.findTypCdVwsByTypCdVwKey_CdciCdItmIdAndTypCdVwKey_UcfrFltrVal( cdciCdItmId, ucfrFltrVal );

        //then
        assertThat( typCdVwList.isEmpty() ).isFalse();
        assertThat( typCdVwList.size() ).isEqualTo( 7 );

        typCdVwList.forEach( System.out::println );
    }

    @Test
    @Sql({ "/sqlscripts/typcdvwschema01.sql", "/sqlscripts/typcdvwdata01.sql" })
    public void whenFindByCdciCdItmId_And_UcfrFltrVal_thenReturn_SystemSource_List() {
        //given
        int cdciCdItmId = 1286;
        String ucfrFltrVal = "EET";

        //when
        List<TypCdVw> typCdVwList = typCdVwRepository.findTypCdVwsByTypCdVwKey_CdciCdItmIdAndTypCdVwKey_UcfrFltrVal( cdciCdItmId, ucfrFltrVal );

        List<SystemSource> systemSourceList = typCdVwList.stream()
                .filter( t -> t.getTypCdVwKey().getCdcvDomnVal().equals( Constants.WGS20_CMS_SYSTEM_CODE ) )
                .map( x -> new TransformedTypCd( x.getTypCdVwKey().getCdcvDomnVal() ) )
                .map( TransformedTypCd::getSystemSource )
                .collect( toList() );

        //then
        assertThat( systemSourceList.size() ).isEqualTo( 1 );

        systemSourceList.forEach( System.out::println );
    }

    @Test
    @Sql({ "/sqlscripts/typcdvwschema.sql", "/sqlscripts/typcdvwdata.sql" })
    public void whenCreate_TypCdVw_With_TypCdWvKey_thenReturnTypCdVw() {
        //Given
        TypCdVwKey typCdVwKey = new TypCdVwKey(1287, "D952", "EET");

        TypCdVw typCdVw = new TypCdVw( typCdVwKey );

        typCdVw.setCdcvDescTxt( "Testing" );

        //When
        typCdVwRepository.save( typCdVw );

        Optional<TypCdVw> typCdVw1 = typCdVwRepository.findById( typCdVwKey );

        //Then
        assertThat( typCdVw1.isPresent() ).isTrue();
    }
}

