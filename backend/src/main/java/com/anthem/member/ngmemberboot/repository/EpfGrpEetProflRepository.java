package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.EpfGrpEetProfl;
import com.anthem.member.ngmemberboot.model.EpfGrpEetProflPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpfGrpEetProflRepository extends JpaRepository<EpfGrpEetProfl, EpfGrpEetProflPK > {
}
