package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.NtcNtrnlCntct;
import com.anthem.member.ngmemberboot.model.NtcNtrnlCntctPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NtcNtrnlCntctRepository extends JpaRepository<NtcNtrnlCntct, NtcNtrnlCntctPK> {
}
