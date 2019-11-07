package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.JidJobidPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JidJobidRepository extends JpaRepository<JidJobid, JidJobidPK> {

    List<JidJobid> findJidJobidsById_JidJobId(String jobId);

    List<JidJobid> findJidJobidsById_CmsSrcSysCdAndAndId_JidJobIdAndJidJobidStatCd( String systemCode, String jobId, String status );

    List<JidJobid> findJidJobidsById_CmsSrcSysCdAndAndId_JidJobId( String systemCode, String jobId );
}
