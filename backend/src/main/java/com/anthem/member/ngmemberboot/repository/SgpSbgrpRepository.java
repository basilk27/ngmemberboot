package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.SgpSbgrp;
import com.anthem.member.ngmemberboot.model.SgpSbgrpPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SgpSbgrpRepository extends JpaRepository<SgpSbgrp, SgpSbgrpPK> {
}
