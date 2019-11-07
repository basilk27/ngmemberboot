package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="SGP_SBGRP_VW")
public class SgpSbgrpVw {

    @EmbeddedId
    private final SgpSbgrpPK id;

    public SgpSbgrpVw( SgpSbgrpPK id ) {
        this.id = id;
    }

    @Column(name="CMS_EMP_GRP_CLF_CD")
    public String cmsEmpGrpClfCd;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="SGP_BLNG_SBGRP_ID")
    public String sgpBlngSbgrpId;

    @Column(name="SGP_SGRP_EFCTV_DT")
    public Timestamp sgpSgrpEfctvDt;

    @Column(name="SGP_SGRP_TRMTN_DT")
    public Timestamp sgpSgrpTrmtnDt;

    @Column(name="SGP_SLF_BLD_IND")
    public short sgpSlfBldInd;

    @Column(name="SGR_SBGRP_NM_TXT")
    public String sgrSbgrpNmTxt;
}
