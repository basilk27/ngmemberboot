package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.JidJobIdPageSort;
import com.anthem.member.ngmemberboot.model.JidJobidId;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JidJobIdPageSortRepository extends JpaRepository<JidJobIdPageSort, JidJobidId> {

    List<JidJobIdPageSort> findAllByCmsSrcSysCdAndJidJobidStatCd( String cmsSrcSysCd, String jidJobidStatCd, Pageable pageable );
}
