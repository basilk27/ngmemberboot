package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.AscAssocCntct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AscAssocCntctRepository extends JpaRepository<AscAssocCntct, String> {
}
