package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.AdpAlowblDep;
import com.anthem.member.ngmemberboot.model.AdpAlowblDepPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdpAlowblDepRepository extends JpaRepository<AdpAlowblDep, AdpAlowblDepPK> {
}
