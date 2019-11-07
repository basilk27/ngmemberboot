package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.ErpGrpEetRpt;
import com.anthem.member.ngmemberboot.model.ErpGrpEetRptPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErpGrpEetRptRepository extends JpaRepository<ErpGrpEetRpt, ErpGrpEetRptPK> {
}
