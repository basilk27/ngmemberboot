package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.model.TypCdVwKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypCdVwRepository extends JpaRepository<TypCdVw, TypCdVwKey> {

    @Query(value = "SELECT * FROM TYP_CD_VW WHERE CDCI_CD_ITM_ID = ?1 AND UCFR_FLTR_VAL = ?2", nativeQuery = true)
    List<TypCdVw> findByCdciCdItmIdAnducfrFltrVal(int cdciCdItmId, String ucfrFltrVal);
}
