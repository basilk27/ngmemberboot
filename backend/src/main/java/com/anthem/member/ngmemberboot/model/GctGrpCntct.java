package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="GCT_GRP_CNTCT")
public class GctGrpCntct {

    @EmbeddedId
    private GctGrpCntctPK id;

    public GctGrpCntct( GctGrpCntctPK id ) {
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

    //bi-directional many-to-one association to EpfGrpEetProfl
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CMS_SRC_SYS_CD", referencedColumnName="CMS_SRC_SYS_CD",
                    insertable = false, updatable = false),
            @JoinColumn(name="EPF_EFCTV_DT", referencedColumnName="EPF_EFCTV_DT",
                    insertable = false, updatable = false),
            @JoinColumn(name="GRP_GRP_ID", referencedColumnName="GRP_GRP_ID",
                    insertable = false, updatable = false),
            @JoinColumn(name="JID_JOB_ID", referencedColumnName="JID_JOB_ID",
                    insertable = false, updatable = false)
    })
    public EpfGrpEetProfl epfGrpEetProfl;

    //bi-directional many-to-one association to GrpGrp
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CMS_SRC_SYS_CD", referencedColumnName="CMS_SRC_SYS_CD",
                    insertable = false, updatable = false),
            @JoinColumn(name="GRP_GRP_ID", referencedColumnName="GRP_GRP_ID",
                    insertable = false, updatable = false)
    })
    public GrpGrp grpGrp;

    private GctGrpCntct( GctGrpCntctBuilder builder ) {
        this.id = builder.id;
        this.cmsCntryCd = builder.cmsCntryCd;
        this.cmsMailPrfrncCd = builder.cmsMailPrfrncCd;
        this.cmsNmSfxCd = builder.cmsNmSfxCd;
        this.cmsPrmryLangCd = builder.cmsPrmryLangCd;
        this.cmsScndryLangCd = builder.cmsScndryLangCd;
        this.cmsTtlCd = builder.cmsTtlCd;
        this.gctAdrs1Txt = builder.gctAdrs1Txt;
        this.gctAdrs2Txt = builder.gctAdrs2Txt;
        this.gctAltEmalTxt = builder.gctAltEmalTxt;
        this.gctAssocId = builder.gctAssocId;
        this.gctCntctAreaCd = builder.gctCntctAreaCd;
        this.gctCntctPhnExt = builder.gctCntctPhnExt;
        this.gctCntctPhnNbr = builder.gctCntctPhnNbr;
        this.gctCtcFrnexNbr = builder.gctCtcFrnexNbr;
        this.gctCtyTxt = builder.gctCtyTxt;
        this.gctFaxAreaCd = builder.gctFaxAreaCd;
        this.gctFaxFrnexNbr = builder.gctFaxFrnexNbr;
        this.gctFaxPhnExt = builder.gctFaxPhnExt;
        this.gctFaxPhnNbr = builder.gctFaxPhnNbr;
        this.gctFrstNmTxt = builder.gctFrstNmTxt;
        this.gctGrpCntyCd = builder.gctGrpCntyCd;
        this.gctGrpPostlCd = builder.gctGrpPostlCd;
        this.gctGrpZip4Cd = builder.gctGrpZip4Cd;
        this.gctLastNmTxt = builder.gctLastNmTxt;
        this.gctMdlNmTxt = builder.gctMdlNmTxt;
        this.gctPrmryEmalTxt = builder.gctPrmryEmalTxt;
        this.gctPrmyCntctInd = builder.gctPrmyCntctInd;
        this.gctStAbrvCd = builder.gctStAbrvCd;
        this.gctTrmntnDt = builder.gctTrmntnDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.epfGrpEetProfl = builder.epfGrpEetProfl;
        this.grpGrp = builder.grpGrp;
    }

    public static class GctGrpCntctBuilder {
        private GctGrpCntctPK id;
        private String cmsCntryCd;
        private String cmsMailPrfrncCd;
        private String cmsNmSfxCd;
        private String cmsPrmryLangCd;
        private String cmsScndryLangCd;
        private String cmsTtlCd;
        private String gctAdrs1Txt;
        private String gctAdrs2Txt;
        private String gctAltEmalTxt;
        private String gctAssocId;
        private String gctCntctAreaCd;
        private String gctCntctPhnExt;
        private String gctCntctPhnNbr;
        private String gctCtcFrnexNbr;
        private String gctCtyTxt;
        private String gctFaxAreaCd;
        private String gctFaxFrnexNbr;
        private String gctFaxPhnExt;
        private String gctFaxPhnNbr;
        private String gctFrstNmTxt;
        private String gctGrpCntyCd;
        private String gctGrpPostlCd;
        private String gctGrpZip4Cd;
        private String gctLastNmTxt;
        private String gctMdlNmTxt;
        private String gctPrmryEmalTxt;
        private short gctPrmyCntctInd;
        private String gctStAbrvCd;
        private Timestamp gctTrmntnDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private EpfGrpEetProfl epfGrpEetProfl;
        private GrpGrp grpGrp;

        public GctGrpCntctBuilder id( GctGrpCntctPK id ) {
            this.id = id;

            return this;
        }

        public GctGrpCntctBuilder cmsCntryCd( String cmsCntryCd ) {
            this.cmsCntryCd = cmsCntryCd;

            return this;
        }

        public GctGrpCntctBuilder cmsMailPrfrncCd( String cmsMailPrfrncCd ) {
            this.cmsMailPrfrncCd = cmsMailPrfrncCd;

            return this;
        }

        public GctGrpCntctBuilder cmsNmSfxCd( String cmsNmSfxCd ) {
            this.cmsNmSfxCd = cmsNmSfxCd;

            return this;
        }

        public GctGrpCntctBuilder cmsPrmryLangCd( String cmsPrmryLangCd ) {
            this.cmsPrmryLangCd = cmsPrmryLangCd;

            return this;
        }

        public GctGrpCntctBuilder cmsScndryLangCd( String cmsScndryLangCd ) {
            this.cmsScndryLangCd = cmsScndryLangCd;

            return this;
        }

        public GctGrpCntctBuilder cmsTtlCd( String cmsTtlCd ) {
            this.cmsTtlCd = cmsTtlCd;

            return this;
        }

        public GctGrpCntctBuilder gctAdrs1Txt( String gctAdrs1Txt ) {
            this.gctAdrs1Txt = gctAdrs1Txt;

            return this;
        }

        public GctGrpCntctBuilder gctAdrs2Txt( String gctAdrs2Txt ) {
            this.gctAdrs2Txt = gctAdrs2Txt;

            return this;
        }

        public GctGrpCntctBuilder gctAltEmalTxt( String gctAltEmalTxt ) {
            this.gctAltEmalTxt = gctAltEmalTxt;

            return this;
        }

        public GctGrpCntctBuilder gctAssocId( String gctAssocId ) {
            this.gctAssocId = gctAssocId;

            return this;
        }

        public GctGrpCntctBuilder gctCntctAreaCd( String gctCntctAreaCd ) {
            this.gctCntctAreaCd = gctCntctAreaCd;

            return this;
        }

        public GctGrpCntctBuilder gctCntctPhnExt( String gctCntctPhnExt ) {
            this.gctCntctPhnExt = gctCntctPhnExt;

            return this;
        }

        public GctGrpCntctBuilder gctCntctPhnNbr( String gctCntctPhnNbr ) {
            this.gctCntctPhnNbr = gctCntctPhnNbr;

            return this;
        }

        public GctGrpCntctBuilder gctCtcFrnexNbr( String gctCtcFrnexNbr ) {
            this.gctCtcFrnexNbr = gctCtcFrnexNbr;

            return this;
        }

        public GctGrpCntctBuilder gctCtyTxt( String gctCtyTxt ) {
            this.gctCtyTxt = gctCtyTxt;

            return this;
        }

        public GctGrpCntctBuilder gctFaxAreaCd( String gctFaxAreaCd ) {
            this.gctFaxAreaCd = gctFaxAreaCd;

            return this;
        }

        public GctGrpCntctBuilder gctFaxFrnexNbr( String gctFaxFrnexNbr ) {
            this.gctFaxFrnexNbr = gctFaxFrnexNbr;

            return this;
        }

        public GctGrpCntctBuilder gctFaxPhnExt( String gctFaxPhnExt ) {
            this.gctFaxPhnExt = gctFaxPhnExt;

            return this;
        }

        public GctGrpCntctBuilder gctFaxPhnNbr( String gctFaxPhnNbr ) {
            this.gctFaxPhnNbr = gctFaxPhnNbr;

            return this;
        }

        public GctGrpCntctBuilder gctFrstNmTxt( String gctFrstNmTxt ) {
            this.gctFrstNmTxt = gctFrstNmTxt;

            return this;
        }

        public GctGrpCntctBuilder gctGrpCntyCd( String gctGrpCntyCd ) {
            this.gctGrpCntyCd = gctGrpCntyCd;

            return this;
        }

        public GctGrpCntctBuilder gctGrpPostlCd( String gctGrpPostlCd ) {
            this.gctGrpPostlCd = gctGrpPostlCd;

            return this;
        }

        public GctGrpCntctBuilder gctGrpZip4Cd( String gctGrpZip4Cd ) {
            this.gctGrpZip4Cd = gctGrpZip4Cd;

            return this;
        }

        public GctGrpCntctBuilder gctLastNmTxt( String gctLastNmTxt ) {
            this.gctLastNmTxt = gctLastNmTxt;

            return this;
        }

        public GctGrpCntctBuilder gctMdlNmTxt( String gctMdlNmTxt ) {
            this.gctMdlNmTxt = gctMdlNmTxt;

            return this;
        }

        public GctGrpCntctBuilder gctPrmryEmalTxt( String gctPrmryEmalTxt ) {
            this.gctPrmryEmalTxt = gctPrmryEmalTxt;

            return this;
        }

        public GctGrpCntctBuilder gctPrmyCntctInd( short gctPrmyCntctInd ) {
            this.gctPrmyCntctInd = gctPrmyCntctInd;

            return this;
        }

        public GctGrpCntctBuilder gctStAbrvCd( String gctStAbrvCd ) {
            this.gctStAbrvCd = gctStAbrvCd;

            return this;
        }

        public GctGrpCntctBuilder gctTrmntnDt( Timestamp gctTrmntnDt ) {
            this.gctTrmntnDt = gctTrmntnDt;

            return this;
        }

        public GctGrpCntctBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public GctGrpCntctBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public GctGrpCntctBuilder epfGrpEetProfl( EpfGrpEetProfl epfGrpEetProfl ) {
            this.epfGrpEetProfl = epfGrpEetProfl;

            return this;
        }

        public GctGrpCntctBuilder grpGrp( GrpGrp grpGrp ) {
            this.grpGrp = grpGrp;

            return this;
        }

        public GctGrpCntct build() {
            return new GctGrpCntct( this );
        }
    }
}
