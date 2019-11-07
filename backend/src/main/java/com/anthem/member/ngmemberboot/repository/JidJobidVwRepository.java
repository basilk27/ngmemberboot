package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.dto.ClientIdWithDescriptionDTO;
import com.anthem.member.ngmemberboot.model.JidJobidPK;
import com.anthem.member.ngmemberboot.model.JidJobidVw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JidJobidVwRepository extends JpaRepository<JidJobidVw, JidJobidPK> {

    @Query("SELECT new com.anthem.member.ngmemberboot.dto.ClientIdWithDescriptionDTO(v.id, v.jidDescTxt) "
            + "FROM JidJobidVw v WHERE v.id.cmsSrcSysCd = ?1 AND v.jidJobidStatCd = ?2")
    List< ClientIdWithDescriptionDTO > findByClientIdWithDescriptionDTO( String systemType, String status );

    List<JidJobidVw> findById_CmsSrcSysCdAndId_JidJobId( String systemType, String jobId );

    List<JidJobidVw> findById_CmsSrcSysCd( String systemType );
}
