package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.ClnCln;
import com.anthem.member.ngmemberboot.model.ClnClnPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClnClnRepository extends JpaRepository<ClnCln, ClnClnPK> {
}
