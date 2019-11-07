package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.GsxInex;
import com.anthem.member.ngmemberboot.model.GsxInexPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GsxInexRepository extends JpaRepository<GsxInex, GsxInexPK> {
}
