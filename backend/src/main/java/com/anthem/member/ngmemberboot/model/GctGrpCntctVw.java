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
@Table(name="GCT_GRP_CNTCT_VW")
public class GctGrpCntctVw {

    @EmbeddedId
    private final GctGrpCntctPK id;

    public GctGrpCntctVw( GctGrpCntctPK id ) {
        this.id = id;
    }

    @Column(name="CMS_CNTRY_CD")
    public String cmsCntryCd;

    @Column(name="CMS_MAIL_PRFRNC_CD")
    public String cmsMailPrfrncCd;

    @Column(name="CMS_NM_SFX_CD")
    public String cmsNmSfxCd;

    @Column(name="CMS_PRMRY_LANG_CD")
    public String cmsPrmryLangCd;

    @Column(name="CMS_SCNDRY_LANG_CD")
    public String cmsScndryLangCd;

    @Column(name="CMS_TTL_CD")
    public String cmsTtlCd;

    @Column(name="EPF_EFCTV_DT")
    public Timestamp epfEfctvDt;

    @Column(name="GCT_ADRS_1_TXT")
    public String gctAdrs1Txt;

    @Column(name="GCT_ADRS_2_TXT")
    public String gctAdrs2Txt;

    @Column(name="GCT_ALT_EMAL_TXT")
    public String gctAltEmalTxt;

    @Column(name="GCT_ASSOC_ID")
    public String gctAssocId;

    @Column(name="GCT_CNTCT_AREA_CD")
    public String gctCntctAreaCd;

    @Column(name="GCT_CNTCT_PHN_EXT")
    public String gctCntctPhnExt;

    @Column(name="GCT_CNTCT_PHN_NBR")
    public String gctCntctPhnNbr;

    @Column(name="GCT_CTC_FRNEX_NBR")
    public String gctCtcFrnexNbr;

    @Column(name="GCT_CTY_TXT")
    public String gctCtyTxt;

    @Column(name="GCT_FAX_AREA_CD")
    public String gctFaxAreaCd;

    @Column(name="GCT_FAX_FRNEX_NBR")
    public String gctFaxFrnexNbr;

    @Column(name="GCT_FAX_PHN_EXT")
    public String gctFaxPhnExt;

    @Column(name="GCT_FAX_PHN_NBR")
    public String gctFaxPhnNbr;

    @Column(name="GCT_FRST_NM_TXT")
    public String gctFrstNmTxt;

    @Column(name="GCT_GRP_CNTY_CD")
    public String gctGrpCntyCd;

    @Column(name="GCT_GRP_POSTL_CD")
    public String gctGrpPostlCd;

    @Column(name="GCT_GRP_ZIP_4_CD")
    public String gctGrpZip4Cd;

    @Column(name="GCT_LAST_NM_TXT")
    public String gctLastNmTxt;

    @Column(name="GCT_MDL_NM_TXT")
    public String gctMdlNmTxt;

    @Column(name="GCT_PRMRY_EMAL_TXT")
    public String gctPrmryEmalTxt;

    @Column(name="GCT_PRMY_CNTCT_IND")
    public short gctPrmyCntctInd;

    @Column(name="GCT_ST_ABRV_CD")
    public String gctStAbrvCd;

    @Column(name="GCT_TRMNTN_DT")
    public Timestamp gctTrmntnDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
