package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EPF_GRP_EET_PRF_VW")
public class EpfGrpEetPrfVw {

    @EmbeddedId
    private final EpfGrpEetProflPK id;

    public EpfGrpEetPrfVw( EpfGrpEetProflPK id ) {
        this.id = id;
    }

    @Column(name="CMS_ACTN_INEX_CD")
    public String cmsActnInexCd;

    @Column(name="CMS_ADD_CXLD_MBR")
    public String cmsAddCxldMbr;

    @Column(name="CMS_ADRS_REPL")
    public String cmsAdrsRepl;

    @Column(name="CMS_AT_TRM_PRCS_CD")
    public String cmsAtTrmPrcsCd;

    @Column(name="CMS_AUPD_FRST_MTH_TERM")
    public String cmsAupdFrstMthTerm;

    @Column(name="CMS_AUPD_PAR")
    public String cmsAupdPar;

    @Column(name="CMS_CNTY_FROM_ZIP_IND")
    public String cmsCntyFromZipInd;

    @Column(name="CMS_DEP_TRM_IND")
    public String cmsDepTrmInd;

    @Column(name="CMS_DOB_SRC_CD")
    public String cmsDobSrcCd;

    @Column(name="CMS_DT_OF_HIRE_IND")
    public String cmsDtOfHireInd;

    @Column(name="CMS_EET_PFL_STS_CD")
    public String cmsEetPflStsCd;

    @Column(name="CMS_EFF_DT_CHG_CD")
    public String cmsEffDtChgCd;

    @Column(name="CMS_GEN_COB_CD")
    public String cmsGenCobCd;

    @Column(name="CMS_GENU_ADD_SWCH")
    public String cmsGenuAddSwch;

    @Column(name="CMS_GENU_UPD_SWCH")
    public String cmsGenuUpdSwch;

    @Column(name="CMS_GRP_TYP_PUL_CD")
    public String cmsGrpTypPulCd;

    @Column(name="CMS_GRP_TYPE_IND")
    public String cmsGrpTypeInd;

    @Column(name="CMS_GRPSGP_INEX_CD")
    public String cmsGrpsgpInexCd;

    @Column(name="CMS_HYPHEN_NAMES")
    public String cmsHyphenNames;

    @Column(name="CMS_MDF_EFF_DT_CD")
    public String cmsMdfEffDtCd;

    @Column(name="CMS_MDF_TRM_DT_CD")
    public String cmsMdfTrmDtCd;

    @Column(name="CMS_MDL_IN_USE_CD")
    public String cmsMdlInUseCd;

    @Column(name="CMS_NTWK_CHG_CD")
    public String cmsNtwkChgCd;

    @Column(name="CMS_OVR45_SSN_EXMP_SW")
    public String cmsOvr45SsnExmpSw;

    @Column(name="CMS_PCP_CHNG_CD")
    public String cmsPcpChngCd;

    @Column(name="CMS_PCP_PROV_EPDS2_IND")
    public String cmsPcpProvEpds2Ind;

    @Column(name="CMS_PDO_CHNG_CD")
    public String cmsPdoChngCd;

    @Column(name="CMS_PRE_EX_CHG")
    public String cmsPreExChg;

    @Column(name="CMS_PREX_ENDDT_CAL")
    public String cmsPrexEnddtCal;

    @Column(name="CMS_PRFL_LVL_CD")
    public String cmsPrflLvlCd;

    @Column(name="CMS_PROCES_MEDD_CD")
    public String cmsProcesMeddCd;

    @Column(name="CMS_PROD_INEX_CD")
    public String cmsProdInexCd;

    //	@Column(name="CMS_SRC_SYS_CD")
    //	public String cmsSrcSysCd;

    @Column(name="CMS_SSB_CD")
    public String cmsSsbCd;

    @Column(name="CMS_SSCRBR_TRM_IND")
    public String cmsSscrbrTrmInd;

    @Column(name="CMS_TOLERANCE_CHK_SW")
    public String cmsToleranceChkSw;

    @Column(name="CMS_TRM_DT_CHG_CD")
    public String cmsTrmDtChgCd;

    @Column(name="CMS_XREF_DB_CHK")
    public String cmsXrefDbChk;

    @Column(name="EPF_ACTVTY_GDY_QTY")
    public int epfActvtyGdyQty;

    @Column(name="EPF_ADDR_FLIP_IND")
    public short epfAddrFlipInd;

    @Column(name="EPF_ADR_CHG_WB_IND")
    public short epfAdrChgWbInd;

    @Column(name="EPF_ADRS_CHNG_IND")
    public short epfAdrsChngInd;

    @Column(name="EPF_AUPD_ADDS")
    public BigDecimal epfAupdAdds;

    @Column(name="EPF_AUPD_CHANGES")
    public BigDecimal epfAupdChanges;

    @Column(name="EPF_AUPD_DFT_PVDR")
    public BigDecimal epfAupdDftPvdr;

    @Column(name="EPF_AUPD_ERRORS_CNT")
    public BigDecimal epfAupdErrorsCnt;

    @Column(name="EPF_AUPD_EXP_TERM")
    public BigDecimal epfAupdExpTerm;

    @Column(name="EPF_AUPD_IMP_TERM")
    public BigDecimal epfAupdImpTerm;

    @Column(name="EPF_AUPD_REC_CNT")
    public BigDecimal epfAupdRecCnt;

    @Column(name="EPF_BEN_EFCTV_DT_IND")
    public String epfBenEfctvDtInd;

    @Column(name="EPF_BKUP_PREV_ENRLMNT_CNT")
    public BigDecimal epfBkupPrevEnrlmntCnt;

    @Column(name="EPF_COB_OVRD_IND")
    public String epfCobOvrdInd;

    @Column(name="EPF_CRT_DT_TM")
    public Timestamp epfCrtDtTm;

    @Column(name="EPF_CRT_USR_ID")
    public String epfCrtUsrId;

    @Column(name="EPF_DEP_CVG_IND")
    public short epfDepCvgInd;

    @Column(name="EPF_DEP_TRM_IND")
    public short epfDepTrmInd;

    @Column(name="EPF_DEP_USE_IND")
    public short epfDepUseInd;

    @Column(name="EPF_DFLT_NTWK_ID")
    public String epfDfltNtwkId;

    @Column(name="EPF_DFLT_PCP_ID")
    public String epfDfltPcpId;

    @Column(name="EPF_DFLT_PDO_ID")
    public String epfDfltPdoId;

    @Column(name="EPF_DFLT_PMG_ID")
    public String epfDfltPmgId;

    @Column(name="EPF_DUP_COV_ERR_SUPP_IND")
    public String epfDupCovErrSuppInd;

    @Column(name="EPF_DURNL_CAP_IND")
    public short epfDurnlCapInd;

    //	@Column(name="EPF_EFCTV_DT")
    //	public Timestamp epfEfctvDt;

    @Column(name="EPF_ERR_TLRNC_LVL_PCT")
    public BigDecimal epfErrTlrncLvlPct;

    @Column(name="EPF_EXCHNG_ENTRPR_CD")
    public String epfExchngEntrprCd;

    @Column(name="EPF_EXCHNG_NBR")
    public short epfExchngNbr;

    @Column(name="EPF_EXCHNG_NM")
    public String epfExchngNm;

    @Column(name="EPF_GEN_MDCR_IND")
    public short epfGenMdcrInd;

    @Column(name="EPF_GEN_PREX_IND")
    public short epfGenPrexInd;

    @Column(name="EPF_HDR_EFCTV_DT")
    public Timestamp epfHdrEfctvDt;

    @Column(name="EPF_MBR_FRST_NM_CHK_IND")
    public String epfMbrFrstNmChkInd;

    @Column(name="EPF_NTWK_CHNG_DT")
    public Timestamp epfNtwkChngDt;

    @Column(name="EPF_NTWK_RETRO_QTY")
    public int epfNtwkRetroQty;

    @Column(name="EPF_OAD_PRCS_IND")
    public short epfOadPrcsInd;

    @Column(name="EPF_OVRD_HDR_DT")
    public Timestamp epfOvrdHdrDt;

    @Column(name="EPF_PCP_ERR_SUPP_IND")
    public String epfPcpErrSuppInd;

    @Column(name="EPF_PCP_RETRO_QTY")
    public int epfPcpRetroQty;

    @Column(name="EPF_PDO_RETRO_QTY")
    public int epfPdoRetroQty;

    @Column(name="EPF_PIC_NTWK_IND")
    public short epfPicNtwkInd;

    @Column(name="EPF_PIC_PCP_IND")
    public short epfPicPcpInd;

    @Column(name="EPF_PIC_PDO_IND")
    public short epfPicPdoInd;

    @Column(name="EPF_PIC_PMG_IND")
    public short epfPicPmgInd;

    @Column(name="EPF_PREV_ENRLMNT_CNT")
    public BigDecimal epfPrevEnrlmntCnt;

    @Column(name="EPF_PROC_MDRSK_IND")
    public short epfProcMdrskInd;

    @Column(name="EPF_PROV_CHNG_DT")
    public Timestamp epfProvChngDt;

    @Column(name="EPF_PRVW_IND")
    public short epfPrvwInd;

    @Column(name="EPF_RETRO_DAY_IND")
    public short epfRetroDayInd;

    @Column(name="EPF_RETRO_DAY_QTY")
    public int epfRetroDayQty;

    @Column(name="EPF_RPTFR_CLMC_IND")
    public short epfRptfrClmcInd;

    @Column(name="EPF_RPTFR_CLMR_IND")
    public short epfRptfrClmrInd;

    @Column(name="EPF_RPTFR_DEPT_IND")
    public short epfRptfrDeptInd;

    @Column(name="EPF_RPTFR_EMPL_IND")
    public short epfRptfrEmplInd;

    @Column(name="EPF_RPTFU_CLMC_IND")
    public short epfRptfuClmcInd;

    @Column(name="EPF_RPTFU_CLMR_IND")
    public short epfRptfuClmrInd;

    @Column(name="EPF_RPTFU_DEPT_IND")
    public short epfRptfuDeptInd;

    @Column(name="EPF_RPTFU_EMPL_IND")
    public short epfRptfuEmplInd;

    @Column(name="EPF_RTR_TRM_MO_IND")
    public short epfRtrTrmMoInd;

    @Column(name="EPF_RTR_TRM_MO_QTY")
    public int epfRtrTrmMoQty;

    @Column(name="EPF_RTRV_CLINT_IND")
    public short epfRtrvClintInd;

    @Column(name="EPF_SSCRBR_TRM_IND")
    public short epfSscrbrTrmInd;

    @Column(name="EPF_TRMNTN_DT")
    public Timestamp epfTrmntnDt;

    @Column(name="EPF_VDTSPC_PRV_IND")
    public short epfVdtspcPrvInd;

    //	@Column(name="GRP_GRP_ID")
    //	public String grpGrpId;

    @Column(name="JID_CMS_SRC_SYS_CD")
    public String jidCmsSrcSysCd;

    @Column(name="JID_EFCTV_DT")
    public Timestamp jidEfctvDt;

    //	@Column(name="JID_JOB_ID")
    //	public String jidJobId;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="SGP_SBGRP_ID")
    public String sgpSbgrpId;
}
