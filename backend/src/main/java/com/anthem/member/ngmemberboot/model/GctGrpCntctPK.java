package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable
public class GctGrpCntctPK implements Serializable {

    @Column(name="JID_JOB_ID", insertable=false, updatable=false)
    private final String jidJobId;

    @Column(name="GRP_GRP_ID", insertable=false, updatable=false)
    private final String grpGrpId;

    @Column(name="SGP_SBGRP_ID")
    private final String sgpSbgrpId;

    @Column(name="CMS_SRC_SYS_CD", insertable=false, updatable=false)
    private final String cmsSrcSysCd;

    @Column(name="GCT_CNTC_EFCTV_DT")
    private final Timestamp gctCntcEfctvDt;

    @Column(name="GCT_SQNC_NBR")
    private final short gctSqncNbr;

    @Column(name="CMS_CNTCT_TYP_CD")
    private final String cmsCntctTypCd;
}
