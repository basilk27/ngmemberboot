package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.GrpGrp;
import com.anthem.member.ngmemberboot.model.GrpGrpPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrpGrpRepositoy extends JpaRepository<GrpGrp, GrpGrpPK> {
}
