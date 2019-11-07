package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.PrxInex;
import com.anthem.member.ngmemberboot.model.PrxInexPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrxInexRepository extends JpaRepository<PrxInex, PrxInexPK> {
}
