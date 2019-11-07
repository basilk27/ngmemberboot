package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.model.TypCdVwKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypCdVwRepository extends JpaRepository<TypCdVw, TypCdVwKey> {

    List<TypCdVw> findTypCdVwsByTypCdVwKey_CdciCdItmIdAndTypCdVwKey_UcfrFltrVal(int cdciCdItmId, String ucfrFltrVal);
}
