package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.JxfXref;
import com.anthem.member.ngmemberboot.model.JxfXrefPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface JxfXrefRepository extends JpaRepository<JxfXref, JxfXrefPK> {

    List<JxfXref> findJxfXrefsById_CmsSrcSysCdAndAndJidJobIdAndIdJxfEfctvDtGreaterThanEqual(
                                                String systemType, String jobId, Timestamp effectiveDate );

    List<JxfXref> findJxfXrefsById_CmsSrcSysCdAndAndJidJobId( String systemType, String jobId );
}
