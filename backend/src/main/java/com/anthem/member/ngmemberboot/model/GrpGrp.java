package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="GRP_GRP")
public class GrpGrp {

    @EmbeddedId
    private GrpGrpPK id;

    public GrpGrp( GrpGrpPK id ) {
        this.id = id;
    }

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

    //bi-directional many-to-one association to AdpAlowblDep
    @OneToMany(fetch = FetchType.LAZY, targetEntity = AdpAlowblDep.class, mappedBy="grpGrp")
    public List<AdpAlowblDep> adpAlowblDeps;

    //bi-directional many-to-one association to EfdFilDefn
    @OneToMany(fetch = FetchType.LAZY, targetEntity = EfdFilDefn.class, mappedBy="grpGrp")
    public List<EfdFilDefn> efdFilDefns;

    //bi-directional many-to-one association to GctGrpCntct
    @OneToMany(fetch = FetchType.LAZY, targetEntity = GctGrpCntct.class, mappedBy="grpGrp")
    public List<GctGrpCntct> gctGrpCntcts;

    //bi-directional many-to-one association to ClnCln
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CLN_CLNT_ID", referencedColumnName="CLN_CLNT_ID",
                    insertable = false, updatable = false),
            @JoinColumn(name="CMS_SRC_SYS_CD", referencedColumnName="CMS_SRC_SYS_CD",
                    insertable = false, updatable = false)
    })
    public ClnCln clnCln;

    //bi-directional many-to-one association to SgpSbgrp
    @OneToMany(fetch = FetchType.LAZY, targetEntity = SgpSbgrp.class, mappedBy="grpGrp")
    public List<SgpSbgrp> sgpSbgrps;

    private GrpGrp( GrpGrpBuilder builder ) {
        this.id = builder.id;
        this.cmsCntrcCgryCd = builder.cmsCntrcCgryCd;
        this.cmsGrpTypCd = builder.cmsGrpTypCd;
        this.cmsMdcrInsOrCd = builder.cmsMdcrInsOrCd;
        this.cmsStatCd = builder.cmsStatCd;
        this.cmsTrmntnRsnCd = builder.cmsTrmntnRsnCd;
        this.grpGrpAnivMo = builder.grpGrpAnivMo;
        this.grpGrpEfctvDt = builder.grpGrpEfctvDt;
        this.grpGrpNmTxt = builder.grpGrpNmTxt;
        this.grpGrpTrmntnDt = builder.grpGrpTrmntnDt;
        this.grpMbuCd = builder.grpMbuCd;
        this.grpNdvBusTypCd = builder.grpNdvBusTypCd;
        this.grpRnwlDt = builder.grpRnwlDt;
        this.grpTaxId = builder.grpTaxId;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.adpAlowblDeps = builder.adpAlowblDeps;
        this.efdFilDefns = builder.efdFilDefns;
        this.gctGrpCntcts = builder.gctGrpCntcts;
        this.clnCln = builder.clnCln;
        this.sgpSbgrps = builder.sgpSbgrps;
    }

    public static class GrpGrpBuilder {
        private GrpGrpPK id;
        private String cmsCntrcCgryCd;
        private String cmsGrpTypCd;
        private String cmsMdcrInsOrCd;
        private String cmsStatCd;
        private String cmsTrmntnRsnCd;
        private Timestamp grpGrpAnivMo;
        private Timestamp grpGrpEfctvDt;
        private String grpGrpNmTxt;
        private Timestamp grpGrpTrmntnDt;
        private String grpMbuCd;
        private String grpNdvBusTypCd;
        private Timestamp grpRnwlDt;
        private String grpTaxId;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private List<AdpAlowblDep> adpAlowblDeps;
        private List<EfdFilDefn> efdFilDefns;
        private List<GctGrpCntct> gctGrpCntcts;
        private ClnCln clnCln;
        private List<SgpSbgrp> sgpSbgrps;


        public GrpGrpBuilder id( GrpGrpPK id ) {
            this.id = id;

            return this;
        }

        public GrpGrpBuilder cmsCntrcCgryCd( String cmsCntrcCgryCd ) {
            this.cmsCntrcCgryCd = cmsCntrcCgryCd;

            return this;
        }

        public GrpGrpBuilder cmsGrpTypCd( String cmsGrpTypCd ) {
            this.cmsGrpTypCd = cmsGrpTypCd;

            return this;
        }

        public GrpGrpBuilder cmsMdcrInsOrCd( String cmsMdcrInsOrCd ) {
            this.cmsMdcrInsOrCd = cmsMdcrInsOrCd;

            return this;
        }

        public GrpGrpBuilder cmsStatCd( String cmsStatCd ) {
            this.cmsStatCd = cmsStatCd;

            return this;
        }

        public GrpGrpBuilder cmsTrmntnRsnCd( String cmsTrmntnRsnCd ) {
            this.cmsTrmntnRsnCd = cmsTrmntnRsnCd;

            return this;
        }

        public GrpGrpBuilder grpGrpAnivMo( Timestamp grpGrpAnivMo ) {
            this.grpGrpAnivMo = grpGrpAnivMo;

            return this;
        }

        public GrpGrpBuilder grpGrpEfctvDt( Timestamp grpGrpEfctvDt ) {
            this.grpGrpEfctvDt = grpGrpEfctvDt;

            return this;
        }

        public GrpGrpBuilder grpGrpNmTxt( String grpGrpNmTxt ) {
            this.grpGrpNmTxt = grpGrpNmTxt;

            return this;
        }

        public GrpGrpBuilder grpGrpTrmntnDt( Timestamp grpGrpTrmntnDt ) {
            this.grpGrpTrmntnDt = grpGrpTrmntnDt;

            return this;
        }

        public GrpGrpBuilder grpMbuCd( String grpMbuCd ) {
            this.grpMbuCd = grpMbuCd;

            return this;
        }

        public GrpGrpBuilder grpNdvBusTypCd( String grpNdvBusTypCd ) {
            this.grpNdvBusTypCd = grpNdvBusTypCd;

            return this;
        }

        public GrpGrpBuilder grpRnwlDt( Timestamp grpRnwlDt ) {
            this.grpRnwlDt = grpRnwlDt;

            return this;
        }

        public GrpGrpBuilder grpTaxId( String grpTaxId ) {
            this.grpTaxId = grpTaxId;

            return this;
        }

        public GrpGrpBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public GrpGrpBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public GrpGrpBuilder adpAlowblDeps( List<AdpAlowblDep> adpAlowblDeps ) {
            this.adpAlowblDeps = adpAlowblDeps;

            return this;
        }

        public GrpGrpBuilder efdFilDefns( List<EfdFilDefn> efdFilDefns ) {
            this.efdFilDefns = efdFilDefns;

            return this;
        }

        public GrpGrpBuilder gctGrpCntcts( List<GctGrpCntct> gctGrpCntcts ) {
            this.gctGrpCntcts = gctGrpCntcts;

            return this;
        }

        public GrpGrpBuilder clnCln( ClnCln clnCln ) {
            this.clnCln = clnCln;

            return this;
        }

        public GrpGrpBuilder sgpSbgrps( List<SgpSbgrp> sgpSbgrps ) {
            this.sgpSbgrps = sgpSbgrps;

            return this;
        }

        public GrpGrp build() {
            return new GrpGrp( this );
        }
    }
}
