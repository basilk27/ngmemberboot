package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EPF_GRP_EET_PROFL")
public class EpfGrpEetProfl {

    @EmbeddedId
    private final EpfGrpEetProflPK id;

    public EpfGrpEetProfl( EpfGrpEetProflPK id ) {
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

    @Column(name="JID_CMS_SRC_SYS_CD")
    public String jidCmsSrcSysCd;

    @Column(name="JID_EFCTV_DT")
    public Timestamp jidEfctvDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="SGP_SBGRP_ID")
    public String sgpSbgrpId;

    //bi-directional many-to-one association to EfdFilDefn
    @OneToMany(fetch = FetchType.LAZY, targetEntity = EfdFilDefn.class, mappedBy="epfGrpEetProfl")
    public List<EfdFilDefn> efdFilDefns;

    //bi-directional many-to-one association to GctGrpCntct
    @OneToMany(fetch = FetchType.LAZY, targetEntity = GctGrpCntct.class, mappedBy="epfGrpEetProfl")
    public List<GctGrpCntct> gctGrpCntcts;

    //bi-directional many-to-one association to GsxInex
    @OneToMany(fetch = FetchType.LAZY, targetEntity = GsxInex.class, mappedBy="epfGrpEetProfl")
    public List<GsxInex> gsxInexs;

    //bi-directional many-to-one association to PrxInex
    @OneToMany(fetch = FetchType.LAZY, targetEntity = PrxInex.class, mappedBy="epfGrpEetProfl")
    public List<PrxInex> prxInexs;

    private EpfGrpEetProfl( EpfGrpEetProflBuilder builder ) {
        this.id = builder.id;
        this.cmsActnInexCd = builder.cmsActnInexCd;
        this.cmsAddCxldMbr = builder.cmsAddCxldMbr;
        this.cmsAdrsRepl = builder.cmsAdrsRepl;
        this.cmsAtTrmPrcsCd = builder.cmsAtTrmPrcsCd;
        this.cmsAupdFrstMthTerm = builder.cmsAupdFrstMthTerm;
        this.cmsAupdPar = builder.cmsAupdPar;
        this.cmsCntyFromZipInd = builder.cmsCntyFromZipInd;
        this.cmsDepTrmInd = builder.cmsDepTrmInd;
        this.cmsDobSrcCd = builder.cmsDobSrcCd;
        this.cmsDtOfHireInd = builder.cmsDtOfHireInd;
        this.cmsEetPflStsCd = builder.cmsEetPflStsCd;
        this.cmsEffDtChgCd = builder.cmsEffDtChgCd;
        this.cmsGenCobCd = builder.cmsGenCobCd;
        this.cmsGenuAddSwch = builder.cmsGenuAddSwch;
        this.cmsGenuUpdSwch = builder.cmsGenuUpdSwch;
        this.cmsGrpTypPulCd = builder.cmsGrpTypPulCd;
        this.cmsGrpTypeInd = builder.cmsGrpTypeInd;
        this.cmsGrpsgpInexCd = builder.cmsGrpsgpInexCd;
        this.cmsHyphenNames = builder.cmsHyphenNames;
        this.cmsMdfEffDtCd = builder.cmsMdfEffDtCd;
        this.cmsMdfTrmDtCd = builder.cmsMdfTrmDtCd;
        this.cmsMdlInUseCd = builder.cmsMdlInUseCd;
        this.cmsNtwkChgCd = builder.cmsNtwkChgCd;
        this.cmsOvr45SsnExmpSw = builder.cmsOvr45SsnExmpSw;
        this.cmsPcpChngCd = builder.cmsPcpChngCd;
        this.cmsPcpProvEpds2Ind = builder.cmsPcpProvEpds2Ind;
        this.cmsPdoChngCd = builder.cmsPdoChngCd;
        this.cmsPreExChg = builder.cmsPreExChg;
        this.cmsPrexEnddtCal = builder.cmsPrexEnddtCal;
        this.cmsPrflLvlCd = builder.cmsPrflLvlCd;
        this.cmsProcesMeddCd = builder.cmsProcesMeddCd;
        this.cmsProdInexCd = builder.cmsProdInexCd;
        this.cmsSsbCd = builder.cmsSsbCd;
        this.cmsSscrbrTrmInd = builder.cmsSscrbrTrmInd;
        this.cmsToleranceChkSw = builder.cmsToleranceChkSw;
        this.cmsTrmDtChgCd = builder.cmsTrmDtChgCd;
        this.cmsXrefDbChk = builder.cmsXrefDbChk;
        this.epfActvtyGdyQty = builder.epfActvtyGdyQty;
        this.epfAddrFlipInd = builder.epfAddrFlipInd;
        this.epfAdrChgWbInd = builder.epfAdrChgWbInd;
        this.epfAdrsChngInd = builder.epfAdrsChngInd;
        this.epfAupdAdds = builder.epfAupdAdds;
        this.epfAupdChanges = builder.epfAupdChanges;
        this.epfAupdDftPvdr = builder.epfAupdDftPvdr;
        this.epfAupdErrorsCnt = builder.epfAupdErrorsCnt;
        this.epfAupdExpTerm = builder.epfAupdExpTerm;
        this.epfAupdImpTerm = builder.epfAupdImpTerm;
        this.epfAupdRecCnt = builder.epfAupdRecCnt;
        this.epfBenEfctvDtInd = builder.epfBenEfctvDtInd;
        this.epfBkupPrevEnrlmntCnt = builder.epfBkupPrevEnrlmntCnt;
        this.epfCobOvrdInd = builder.epfCobOvrdInd;
        this.epfCrtDtTm = builder.epfCrtDtTm;
        this.epfCrtUsrId = builder.epfCrtUsrId;
        this.epfDepCvgInd = builder.epfDepCvgInd;
        this.epfDepTrmInd = builder.epfDepTrmInd;
        this.epfDepUseInd = builder.epfDepUseInd;
        this.epfDfltNtwkId = builder.epfDfltNtwkId;
        this.epfDfltPcpId = builder.epfDfltPcpId;
        this.epfDfltPdoId = builder.epfDfltPdoId;
        this.epfDfltPmgId = builder.epfDfltPmgId;
        this.epfDupCovErrSuppInd = builder.epfDupCovErrSuppInd;
        this.epfDurnlCapInd = builder.epfDurnlCapInd;
        this.epfErrTlrncLvlPct = builder.epfErrTlrncLvlPct;
        this.epfExchngEntrprCd = builder.epfExchngEntrprCd;
        this.epfExchngNbr = builder.epfExchngNbr;
        this.epfExchngNm = builder.epfExchngNm;
        this.epfGenMdcrInd = builder.epfGenMdcrInd;
        this.epfGenPrexInd = builder.epfGenPrexInd;
        this.epfHdrEfctvDt = builder.epfHdrEfctvDt;
        this.epfMbrFrstNmChkInd = builder.epfMbrFrstNmChkInd;
        this.epfNtwkChngDt = builder.epfNtwkChngDt;
        this.epfNtwkRetroQty = builder.epfNtwkRetroQty;
        this.epfOadPrcsInd = builder.epfOadPrcsInd;
        this.epfOvrdHdrDt = builder.epfOvrdHdrDt;
        this.epfPcpErrSuppInd = builder.epfPcpErrSuppInd;
        this.epfPcpRetroQty = builder.epfPcpRetroQty;
        this.epfPdoRetroQty = builder.epfPdoRetroQty;
        this.epfPicNtwkInd = builder.epfPicNtwkInd;
        this.epfPicPcpInd = builder.epfPicPcpInd;
        this.epfPicPdoInd = builder.epfPicPdoInd;
        this.epfPicPmgInd = builder.epfPicPmgInd;
        this.epfPrevEnrlmntCnt = builder.epfPrevEnrlmntCnt;
        this.epfProcMdrskInd = builder.epfProcMdrskInd;
        this.epfProvChngDt = builder.epfProvChngDt;
        this.epfPrvwInd = builder.epfPrvwInd;
        this.epfRetroDayInd = builder.epfRetroDayInd;
        this.epfRetroDayQty = builder.epfRetroDayQty;
        this.epfRptfrClmcInd = builder.epfRptfrClmcInd;
        this.epfRptfrClmrInd = builder.epfRptfrClmrInd;
        this.epfRptfrDeptInd = builder.epfRptfrDeptInd;
        this.epfRptfrEmplInd = builder.epfRptfrEmplInd;
        this.epfRptfuClmcInd = builder.epfRptfuClmcInd;
        this.epfRptfuClmrInd = builder.epfRptfuClmrInd;
        this.epfRptfuDeptInd = builder.epfRptfuDeptInd;
        this.epfRptfuEmplInd = builder.epfRptfuEmplInd;
        this.epfRtrTrmMoInd = builder.epfRtrTrmMoInd;
        this.epfRtrTrmMoQty = builder.epfRtrTrmMoQty;
        this.epfRtrvClintInd = builder.epfRtrvClintInd;
        this.epfSscrbrTrmInd = builder.epfSscrbrTrmInd;
        this.epfTrmntnDt = builder.epfTrmntnDt;
        this.epfVdtspcPrvInd = builder.epfVdtspcPrvInd;
        this.jidCmsSrcSysCd = builder.jidCmsSrcSysCd;
        this.jidEfctvDt = builder.jidEfctvDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.sgpSbgrpId = builder.sgpSbgrpId;
        this.efdFilDefns = builder.efdFilDefns;
        this.gctGrpCntcts = builder.gctGrpCntcts;
        this.gsxInexs = builder.gsxInexs;
        this.prxInexs = builder.prxInexs;
    }

    public static class EpfGrpEetProflBuilder {
        private EpfGrpEetProflPK id;
        private String cmsActnInexCd;
        private String cmsAddCxldMbr;
        private String cmsAdrsRepl;
        private String cmsAtTrmPrcsCd;
        private String cmsAupdFrstMthTerm;
        private String cmsAupdPar;
        private String cmsCntyFromZipInd;
        private String cmsDepTrmInd;
        private String cmsDobSrcCd;
        private String cmsDtOfHireInd;
        private String cmsEetPflStsCd;
        private String cmsEffDtChgCd;
        private String cmsGenCobCd;
        private String cmsGenuAddSwch;
        private String cmsGenuUpdSwch;
        private String cmsGrpTypPulCd;
        private String cmsGrpTypeInd;
        private String cmsGrpsgpInexCd;
        private String cmsHyphenNames;
        private String cmsMdfEffDtCd;
        private String cmsMdfTrmDtCd;
        private String cmsMdlInUseCd;
        private String cmsNtwkChgCd;
        private String cmsOvr45SsnExmpSw;
        private String cmsPcpChngCd;
        private String cmsPcpProvEpds2Ind;
        private String cmsPdoChngCd;
        private String cmsPreExChg;
        private String cmsPrexEnddtCal;
        private String cmsPrflLvlCd;
        private String cmsProcesMeddCd;
        private String cmsProdInexCd;
        private String cmsSsbCd;
        private String cmsSscrbrTrmInd;
        private String cmsToleranceChkSw;
        private String cmsTrmDtChgCd;
        private String cmsXrefDbChk;
        private int epfActvtyGdyQty;
        private short epfAddrFlipInd;
        private short epfAdrChgWbInd;
        private short epfAdrsChngInd;
        private BigDecimal epfAupdAdds;
        private BigDecimal epfAupdChanges;
        private BigDecimal epfAupdDftPvdr;
        private BigDecimal epfAupdErrorsCnt;
        private BigDecimal epfAupdExpTerm;
        private BigDecimal epfAupdImpTerm;
        private BigDecimal epfAupdRecCnt;
        private String epfBenEfctvDtInd;
        private BigDecimal epfBkupPrevEnrlmntCnt;
        private String epfCobOvrdInd;
        private Timestamp epfCrtDtTm;
        private String epfCrtUsrId;
        private short epfDepCvgInd;
        private short epfDepTrmInd;
        private short epfDepUseInd;
        private String epfDfltNtwkId;
        private String epfDfltPcpId;
        private String epfDfltPdoId;
        private String epfDfltPmgId;
        private String epfDupCovErrSuppInd;
        private short epfDurnlCapInd;
        private BigDecimal epfErrTlrncLvlPct;
        private String epfExchngEntrprCd;
        private short epfExchngNbr;
        private String epfExchngNm;
        private short epfGenMdcrInd;
        private short epfGenPrexInd;
        private Timestamp epfHdrEfctvDt;
        private String epfMbrFrstNmChkInd;
        private Timestamp epfNtwkChngDt;
        private int epfNtwkRetroQty;
        private short epfOadPrcsInd;
        private Timestamp epfOvrdHdrDt;
        private String epfPcpErrSuppInd;
        private int epfPcpRetroQty;
        private int epfPdoRetroQty;
        private short epfPicNtwkInd;
        private short epfPicPcpInd;
        private short epfPicPdoInd;
        private short epfPicPmgInd;
        private BigDecimal epfPrevEnrlmntCnt;
        private short epfProcMdrskInd;
        private Timestamp epfProvChngDt;
        private short epfPrvwInd;
        private short epfRetroDayInd;
        private int epfRetroDayQty;
        private short epfRptfrClmcInd;
        private short epfRptfrClmrInd;
        private short epfRptfrDeptInd;
        private short epfRptfrEmplInd;
        private short epfRptfuClmcInd;
        private short epfRptfuClmrInd;
        private short epfRptfuDeptInd;
        private short epfRptfuEmplInd;
        private short epfRtrTrmMoInd;
        private int epfRtrTrmMoQty;
        private short epfRtrvClintInd;
        private short epfSscrbrTrmInd;
        private Timestamp epfTrmntnDt;
        private short epfVdtspcPrvInd;
        private String jidCmsSrcSysCd;
        private Timestamp jidEfctvDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private String sgpSbgrpId;
        private List<EfdFilDefn> efdFilDefns;
        private List<GctGrpCntct> gctGrpCntcts;
        private List<GsxInex> gsxInexs;
        private List<PrxInex> prxInexs;

        public EpfGrpEetProflBuilder id( EpfGrpEetProflPK id ) {
            this.id = id;

            return this;
        }

        public EpfGrpEetProflBuilder cmsActnInexCd( String cmsActnInexCd ) {
            this.cmsActnInexCd = cmsActnInexCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsAddCxldMbr(String cmsAddCxldMbr ) {
            this.cmsAddCxldMbr = cmsAddCxldMbr;

            return this;
        }
        public EpfGrpEetProflBuilder cmsAdrsRepl( String cmsAdrsRepl ) {
            this.cmsAdrsRepl = cmsAdrsRepl;

            return this;
        }

        public EpfGrpEetProflBuilder cmsAtTrmPrcsCd( String cmsAtTrmPrcsCd ) {
            this.cmsAtTrmPrcsCd = cmsAtTrmPrcsCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsAupdFrstMthTerm( String cmsAupdFrstMthTerm ) {
            this.cmsAupdFrstMthTerm = cmsAupdFrstMthTerm;

            return this;
        }

        public EpfGrpEetProflBuilder cmsAupdPar( String cmsAupdPar ) {
            this.cmsAupdPar = cmsAupdPar;

            return  this;
        }

        public EpfGrpEetProflBuilder cmsCntyFromZipInd( String cmsCntyFromZipInd ) {
            this.cmsCntyFromZipInd = cmsCntyFromZipInd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsDepTrmInd( String cmsDepTrmInd ) {
            this.cmsDepTrmInd = cmsDepTrmInd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsDobSrcCd( String cmsDobSrcCd ) {
            this.cmsDobSrcCd = cmsDobSrcCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsDtOfHireInd( String cmsDtOfHireInd ) {
            this.cmsDtOfHireInd = cmsDtOfHireInd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsEetPflStsCd( String cmsEetPflStsCd ) {
            this.cmsEetPflStsCd = cmsEetPflStsCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsEffDtChgCd( String cmsEffDtChgCd ) {
            this.cmsEffDtChgCd = cmsEffDtChgCd;

            return  this;
        }

        public EpfGrpEetProflBuilder cmsGenCobCd( String cmsGenCobCd ) {
            this.cmsGenCobCd = cmsGenCobCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsGenuAddSwch( String cmsGenuAddSwch ) {
            this.cmsGenuAddSwch = cmsGenuAddSwch;

            return  this;
        }

        public EpfGrpEetProflBuilder cmsGenuUpdSwch( String cmsGenuUpdSwch ) {
            this.cmsGenuUpdSwch = cmsGenuUpdSwch;

            return this;
        }

        public EpfGrpEetProflBuilder cmsGrpTypPulCd( String cmsGrpTypPulCd ) {
            this.cmsGrpTypPulCd = cmsGrpTypPulCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsGrpTypeInd( String cmsGrpTypeInd ) {
            this.cmsGrpTypeInd = cmsGrpTypeInd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsGrpsgpInexCd( String cmsGrpsgpInexCd ) {
            this.cmsGrpsgpInexCd = cmsGrpsgpInexCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsHyphenNames( String cmsHyphenNames ) {
            this.cmsHyphenNames = cmsHyphenNames;

            return this;
        }

        public EpfGrpEetProflBuilder cmsMdfEffDtCd( String cmsMdfEffDtCd ) {
            this.cmsMdfEffDtCd = cmsMdfEffDtCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsMdfTrmDtCd( String cmsMdfTrmDtCd ) {
            this.cmsMdfTrmDtCd = cmsMdfTrmDtCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsMdlInUseCd( String cmsMdlInUseCd ) {
            this.cmsMdlInUseCd = cmsMdlInUseCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsNtwkChgCd( String cmsNtwkChgCd ) {
            this.cmsNtwkChgCd = cmsNtwkChgCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsOvr45SsnExmpSw( String cmsOvr45SsnExmpSw ) {
            this.cmsOvr45SsnExmpSw = cmsOvr45SsnExmpSw;

            return this;
        }

        public EpfGrpEetProflBuilder cmsPcpChngCd( String cmsPcpChngCd ) {
            this.cmsPcpChngCd = cmsPcpChngCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsPcpProvEpds2Ind( String cmsPcpProvEpds2Ind ) {
            this.cmsPcpProvEpds2Ind = cmsPcpProvEpds2Ind;

            return this;
        }

        public EpfGrpEetProflBuilder cmsPdoChngCd( String cmsPdoChngCd ) {
            this.cmsPdoChngCd = cmsPdoChngCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsPreExChg( String cmsPreExChg ) {
            this.cmsPreExChg = cmsPreExChg;

            return this;
        }

        public EpfGrpEetProflBuilder cmsPrexEnddtCal( String cmsPrexEnddtCal ) {
            this.cmsPrexEnddtCal = cmsPrexEnddtCal;

            return this;
        }

        public EpfGrpEetProflBuilder cmsPrflLvlCd( String cmsPrflLvlCd ) {
            this.cmsPrflLvlCd = cmsPrflLvlCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsProcesMeddCd( String cmsProcesMeddCd ) {
            this.cmsProcesMeddCd = cmsProcesMeddCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsProdInexCd( String cmsProdInexCd ) {
            this.cmsProdInexCd = cmsProdInexCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsSsbCd( String cmsSsbCd ) {
            this.cmsSsbCd = cmsSsbCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsSscrbrTrmInd( String cmsSscrbrTrmInd ) {
            this.cmsSscrbrTrmInd = cmsSscrbrTrmInd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsToleranceChkSw( String cmsToleranceChkSw ) {
            this.cmsToleranceChkSw = cmsToleranceChkSw;

            return this;
        }

        public EpfGrpEetProflBuilder cmsTrmDtChgCd( String cmsTrmDtChgCd ) {
            this.cmsTrmDtChgCd = cmsTrmDtChgCd;

            return this;
        }

        public EpfGrpEetProflBuilder cmsXrefDbChk( String cmsXrefDbChk ) {
            this.cmsXrefDbChk = cmsXrefDbChk;

            return this;
        }

        public EpfGrpEetProflBuilder epfActvtyGdyQty( int epfActvtyGdyQty ) {
            this.epfActvtyGdyQty = epfActvtyGdyQty;

            return this;
        }

        public EpfGrpEetProflBuilder epfAddrFlipInd( short epfAddrFlipInd ) {
            this.epfAddrFlipInd = epfAddrFlipInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfAdrChgWbInd( short epfAdrChgWbInd ) {
            this.epfAdrChgWbInd = epfAdrChgWbInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfAdrsChngInd( short epfAdrsChngInd ) {
            this.epfAdrsChngInd = epfAdrsChngInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdAdds( BigDecimal epfAupdAdds ) {
            this.epfAupdAdds = epfAupdAdds;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdChanges( BigDecimal epfAupdChanges ) {
            this.epfAupdChanges = epfAupdChanges;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdDftPvdr( BigDecimal epfAupdDftPvdr ) {
            this.epfAupdDftPvdr = epfAupdDftPvdr;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdErrorsCnt( BigDecimal epfAupdErrorsCnt ) {
            this.epfAupdErrorsCnt = epfAupdErrorsCnt;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdExpTerm( BigDecimal epfAupdExpTerm ) {
            this.epfAupdExpTerm = epfAupdExpTerm;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdImpTerm( BigDecimal epfAupdImpTerm ) {
            this.epfAupdImpTerm = epfAupdImpTerm;

            return this;
        }

        public EpfGrpEetProflBuilder epfAupdRecCnt( BigDecimal epfAupdRecCnt ) {
            this.epfAupdRecCnt = epfAupdRecCnt;

            return this;
        }

        public EpfGrpEetProflBuilder epfBenEfctvDtInd( String epfBenEfctvDtInd ) {
            this.epfBenEfctvDtInd = epfBenEfctvDtInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfBkupPrevEnrlmntCnt( BigDecimal epfBkupPrevEnrlmntCnt ) {
            this.epfBkupPrevEnrlmntCnt = epfBkupPrevEnrlmntCnt;

            return this;
        }

        public EpfGrpEetProflBuilder epfCobOvrdInd( String epfCobOvrdInd ) {
            this.epfCobOvrdInd = epfCobOvrdInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfCrtDtTm( Timestamp epfCrtDtTm ) {
            this.epfCrtDtTm = epfCrtDtTm;

            return this;
        }

        public EpfGrpEetProflBuilder epfCrtUsrId( String epfCrtUsrId ) {
            this.epfCrtUsrId = epfCrtUsrId;

            return this;
        }

        public EpfGrpEetProflBuilder epfDepCvgInd( short epfDepCvgInd ) {
            this.epfDepCvgInd = epfDepCvgInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfDepTrmInd( short epfDepTrmInd ) {
            this.epfDepTrmInd = epfDepTrmInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfDepUseInd( short epfDepUseInd ) {
            this.epfDepUseInd = epfDepUseInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfDfltNtwkId( String epfDfltNtwkId ) {
            this.epfDfltNtwkId = epfDfltNtwkId;

            return this;
        }

        public EpfGrpEetProflBuilder epfDfltPcpId( String epfDfltPcpId ) {
            this.epfDfltPcpId = epfDfltPcpId;

            return this;
        }

        public EpfGrpEetProflBuilder epfDfltPdoId( String epfDfltPdoId ) {
            this.epfDfltPdoId = epfDfltPdoId;

            return this;
        }

        public EpfGrpEetProflBuilder epfDfltPmgId( String epfDfltPmgId ) {
            this.epfDfltPmgId = epfDfltPmgId;

            return this;
        }

        public EpfGrpEetProflBuilder epfDupCovErrSuppInd( String epfDupCovErrSuppInd ) {
            this.epfDupCovErrSuppInd = epfDupCovErrSuppInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfDurnlCapInd( short epfDurnlCapInd ) {
            this.epfDurnlCapInd = epfDurnlCapInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfErrTlrncLvlPct( BigDecimal epfErrTlrncLvlPct ) {
            this.epfErrTlrncLvlPct = epfErrTlrncLvlPct;

            return this;
        }

        public EpfGrpEetProflBuilder epfExchngEntrprCd( String epfExchngEntrprCd ) {
            this.epfExchngEntrprCd = epfExchngEntrprCd;

            return this;
        }

        public EpfGrpEetProflBuilder epfExchngNbr( short epfExchngNbr ) {
            this.epfExchngNbr = epfExchngNbr;

            return this;
        }

        public EpfGrpEetProflBuilder epfExchngNm( String epfExchngNm ) {
            this.epfExchngNm = epfExchngNm;

            return this;
        }

        public EpfGrpEetProflBuilder epfGenMdcrInd( short epfGenMdcrInd ) {
            this.epfGenMdcrInd = epfGenMdcrInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfGenPrexInd( short epfGenPrexInd ) {
            this.epfGenPrexInd = epfGenPrexInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfHdrEfctvDt( Timestamp epfHdrEfctvDt ) {
            this.epfHdrEfctvDt = epfHdrEfctvDt;

            return this;
        }

        public EpfGrpEetProflBuilder epfMbrFrstNmChkInd( String epfMbrFrstNmChkInd ) {
            this.epfMbrFrstNmChkInd = epfMbrFrstNmChkInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfNtwkChngDt( Timestamp epfNtwkChngDt ) {
            this.epfNtwkChngDt = epfNtwkChngDt;

            return this;
        }

        public EpfGrpEetProflBuilder epfNtwkRetroQty( int epfNtwkRetroQty ) {
            this.epfNtwkRetroQty = epfNtwkRetroQty;

            return this;
        }

        public EpfGrpEetProflBuilder epfOadPrcsInd( short epfOadPrcsInd ) {
            this.epfOadPrcsInd = epfOadPrcsInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfOvrdHdrDt( Timestamp epfOvrdHdrDt ) {
            this.epfOvrdHdrDt = epfOvrdHdrDt;

            return this;
        }

        public EpfGrpEetProflBuilder epfPcpErrSuppInd( String epfPcpErrSuppInd ) {
            this.epfPcpErrSuppInd = epfPcpErrSuppInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfPcpRetroQty( int epfPcpRetroQty ) {
            this.epfPcpRetroQty = epfPcpRetroQty;

            return this;
        }

        public EpfGrpEetProflBuilder epfPdoRetroQty( int epfPdoRetroQty ) {
            this.epfPdoRetroQty = epfPdoRetroQty;

            return this;
        }

        public EpfGrpEetProflBuilder epfPicNtwkInd( short epfPicNtwkInd ) {
            this.epfPicNtwkInd = epfPicNtwkInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfPicPcpInd( short epfPicPcpInd ) {
            this.epfPicPcpInd = epfPicPcpInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfPicPdoInd( short epfPicPdoInd ) {
            this.epfPicPdoInd = epfPicPdoInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfPicPmgInd( short epfPicPmgInd ) {
            this.epfPicPmgInd = epfPicPmgInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfPrevEnrlmntCnt( BigDecimal epfPrevEnrlmntCnt ) {
            this.epfPrevEnrlmntCnt = epfPrevEnrlmntCnt;

            return this;
        }

        public EpfGrpEetProflBuilder epfProcMdrskInd( short epfProcMdrskInd ) {
            this.epfProcMdrskInd = epfProcMdrskInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfProvChngDt( Timestamp epfProvChngDt ) {
            this.epfProvChngDt = epfProvChngDt;

            return this;
        }

        public EpfGrpEetProflBuilder epfPrvwInd( short epfPrvwInd ) {
            this.epfPrvwInd = epfPrvwInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRetroDayInd( short epfRetroDayInd ) {
            this.epfRetroDayInd = epfRetroDayInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRetroDayQty( int epfRetroDayQty ) {
            this.epfRetroDayQty = epfRetroDayQty;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfrClmcInd( short epfRptfrClmcInd ) {
            this.epfRptfrClmcInd = epfRptfrClmcInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfrClmrInd( short epfRptfrClmrInd ) {
            this.epfRptfrClmrInd = epfRptfrClmrInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfrDeptInd( short epfRptfrDeptInd ) {
            this.epfRptfrDeptInd = epfRptfrDeptInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfrEmplInd( short epfRptfrEmplInd ) {
            this.epfRptfrEmplInd = epfRptfrEmplInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfuClmcInd( short epfRptfuClmcInd ) {
            this.epfRptfuClmcInd = epfRptfuClmcInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfuClmrInd( short epfRptfuClmrInd ) {
            this.epfRptfuClmrInd = epfRptfuClmrInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfuDeptInd( short epfRptfuDeptInd ) {
            this.epfRptfuDeptInd = epfRptfuDeptInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRptfuEmplInd( short epfRptfuEmplInd ) {
            this.epfRptfuEmplInd = epfRptfuEmplInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRtrTrmMoInd( short epfRtrTrmMoInd ) {
            this.epfRtrTrmMoInd = epfRtrTrmMoInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfRtrTrmMoQty( int epfRtrTrmMoQty ) {
            this.epfRtrTrmMoQty = epfRtrTrmMoQty;

            return this;
        }

        public EpfGrpEetProflBuilder epfRtrvClintInd( short epfRtrvClintInd ) {
            this.epfRtrvClintInd = epfRtrvClintInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfSscrbrTrmInd( short epfSscrbrTrmInd ) {
            this.epfSscrbrTrmInd = epfSscrbrTrmInd;

            return this;
        }

        public EpfGrpEetProflBuilder epfTrmntnDt( Timestamp epfTrmntnDt ) {
            this.epfTrmntnDt = epfTrmntnDt;

            return this;
        }

        public EpfGrpEetProflBuilder epfVdtspcPrvInd( short epfVdtspcPrvInd ) {
            this.epfVdtspcPrvInd = epfVdtspcPrvInd;

            return this;
        }

        public EpfGrpEetProflBuilder jidCmsSrcSysCd( String jidCmsSrcSysCd ) {
            this.jidCmsSrcSysCd = jidCmsSrcSysCd;

            return this;
        }

        public EpfGrpEetProflBuilder jidEfctvDt( Timestamp jidEfctvDt ) {
            this.jidEfctvDt = jidEfctvDt;

            return this;
        }

        public EpfGrpEetProflBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public EpfGrpEetProflBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public EpfGrpEetProflBuilder sgpSbgrpId( String sgpSbgrpId ) {
            this.sgpSbgrpId = sgpSbgrpId;

            return this;
        }

        public EpfGrpEetProflBuilder efdFilDefns( List<EfdFilDefn> efdFilDefns ) {
            this.efdFilDefns = efdFilDefns;

            return this;
        }

        public EpfGrpEetProflBuilder gctGrpCntcts( List<GctGrpCntct> gctGrpCntcts ) {
            this.gctGrpCntcts = gctGrpCntcts;

            return this;
        }

        public EpfGrpEetProflBuilder gsxInexs( List<GsxInex> gsxInexs ) {
            this.gsxInexs = gsxInexs;

            return this;
        }

        public EpfGrpEetProflBuilder prxInexs( List<PrxInex> prxInexs ) {
            this.prxInexs = prxInexs;

            return this;
        }

        public EpfGrpEetProfl build() {
            return new EpfGrpEetProfl( this );
        }
    }
}
