package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.EfdFilDefn;
import com.anthem.member.ngmemberboot.model.EfdFilDefnPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EfdFilDefnRepositoy extends JpaRepository<EfdFilDefn, EfdFilDefnPK> {
}
