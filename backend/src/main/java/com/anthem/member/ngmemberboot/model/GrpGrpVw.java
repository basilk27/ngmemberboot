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
@Table(name="GRP_GRP_VW")
public class GrpGrpVw {

    @EmbeddedId
    private final GrpGrpPK id;

    public GrpGrpVw( GrpGrpPK id ) {
        this.id = id;
    }

    @Column(name="CLN_CLNT_ID")
    public String clnClntId;

    @Column(name="CMS_CNTRC_CGRY_CD")
    public String cmsCntrcCgryCd;

    @Column(name="CMS_GRP_TYP_CD")
    public String cmsGrpTypCd;

    @Column(name="CMS_MDCR_INS_OR_CD")
    public String cmsMdcrInsOrCd;

    @Column(name="CMS_STAT_CD")
    public String cmsStatCd;

    @Column(name="CMS_TRMNTN_RSN_CD")
    public String cmsTrmntnRsnCd;

    @Column(name="GRP_GRP_ANIV_MO")
    public Timestamp grpGrpAnivMo;

    @Column(name="GRP_GRP_EFCTV_DT")
    public Timestamp grpGrpEfctvDt;

    @Column(name="GRP_GRP_NM_TXT")
    public String grpGrpNmTxt;

    @Column(name="GRP_GRP_TRMNTN_DT")
    public Timestamp grpGrpTrmntnDt;

    @Column(name="GRP_MBU_CD")
    public String grpMbuCd;

    @Column(name="GRP_NDV_BUS_TYP_CD")
    public String grpNdvBusTypCd;

    @Column(name="GRP_RNWL_DT")
    public Timestamp grpRnwlDt;

    @Column(name="GRP_TAX_ID")
    public String grpTaxId;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
