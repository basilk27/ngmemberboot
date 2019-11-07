package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.ActPrcop;
import com.anthem.member.ngmemberboot.model.ActPrcopPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActPrcopRepository extends JpaRepository<ActPrcop, ActPrcopPK> {
}
