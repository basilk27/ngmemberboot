package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="CMS_UDCV_USRDFND")
public class CmsUdcvUsrdfnd {

    @EmbeddedId
    private CmsUdcvUsrdfndPK id;

    public CmsUdcvUsrdfnd( CmsUdcvUsrdfndPK id ) {
        this.id = id;
    }

    @Column(name="CDCV_CD_VAL_NM")
    public String cdcvCdValNm;

    @Column(name="CDCV_DESC_TXT")
    public String cdcvDescTxt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to CmsUcfrUsrcdFlr
    @OneToMany(fetch = FetchType.LAZY, targetEntity = CmsUcfrUsrcdFlr.class, mappedBy="cmsUdcvUsrdfnd")
    public List<CmsUcfrUsrcdFlr> cmsUcfrUsrcdFlrs;

}
