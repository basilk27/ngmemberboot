package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EPF_EET_ERR_MSG")
public class EpfEetErrMsg {

    @EmbeddedId
    private final EpfEetErrMsgPK id;

    public EpfEetErrMsg( EpfEetErrMsgPK id ) {
        this.id = id;
    }

    @Column(name="BRTH_DT")
    public String brthDt;

    @Column(name="CMS_RLTNSHP_CD")
    public String cmsRltnshpCd;

    @Column(name="ERR_MSG_TXT")
    public String errMsgTxt;

    @Column(name="MBR_FRST_NM")
    public String mbrFrstNm;

    @Column(name="MBR_LAST_NM")
    public String mbrLastNm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
