package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable
public class NtcNtrnlCntctPK implements Serializable {

    @Column(name="CMS_SRC_SYS_CD")
    private final String cmsSrcSysCd;

    @Column(name="GRP_GRP_ID")
    private final String grpGrpId;

    @Column(name="SGP_SBGRP_ID")
    private final String sgpSbgrpId;

    @Column(name="CMS_NTRL_CTC_TP_CD")
    private final String cmsNtrlCtcTpCd;

    @Column(name="ASC_ASSOC_ID")
    private final String ascAssocId;

    @Column(name="NTC_SQNC_NBR")
    private final short ntcSqncNbr;
}
