package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.GctGrpCntct;
import com.anthem.member.ngmemberboot.model.GctGrpCntctPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GctGrpCntctRepository extends JpaRepository<GctGrpCntct, GctGrpCntctPK> {
}
