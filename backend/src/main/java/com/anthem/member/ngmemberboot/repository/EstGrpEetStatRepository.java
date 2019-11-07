package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.EstGrpEetStat;
import com.anthem.member.ngmemberboot.model.EstGrpEetStatPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstGrpEetStatRepository extends JpaRepository<EstGrpEetStat, EstGrpEetStatPK> {
}
