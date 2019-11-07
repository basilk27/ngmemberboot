package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table(name="SGP_SBGRP")
public class SgpSbgrp {

    @EmbeddedId
    private SgpSbgrpPK id;

    public SgpSbgrp( SgpSbgrpPK id ) {
        this.id = id;
    }

    @Column( name = "CMS_EMP_GRP_CLF_CD" )
    public String cmsEmpGrpClfCd;

    @Column( name = "MODIFY_DT_TM" )
    public Timestamp modifyDtTm;

    @Column( name = "MODIFY_USUS_ID" )
    public String modifyUsusId;

    @Column( name = "SGP_BLNG_SBGRP_ID" )
    public String sgpBlngSbgrpId;

    @Column( name = "SGP_SGRP_EFCTV_DT" )
    public Timestamp sgpSgrpEfctvDt;

    @Column( name = "SGP_SGRP_TRMTN_DT" )
    public Timestamp sgpSgrpTrmtnDt;

    @Column( name = "SGP_SLF_BLD_IND" )
    public short sgpSlfBldInd;

    @Column( name = "SGR_SBGRP_NM_TXT" )
    public String sgrSbgrpNmTxt;

    //bi-directional many-to-one association to ActPrcop
    @OneToMany( fetch = FetchType.LAZY, targetEntity = ActPrcop.class, mappedBy = "sgpSbgrp" )
    public List< ActPrcop > actPrcops;

    //bi-directional many-to-one association to AdpAlowblDep
    @OneToMany( fetch = FetchType.LAZY, targetEntity = AdpAlowblDep.class, mappedBy = "sgpSbgrp" )
    public List< AdpAlowblDep > adpAlowblDeps;

    //bi-directional many-to-one association to ErpGrpEetRpt
    @OneToMany( fetch = FetchType.LAZY, targetEntity = ErpGrpEetRpt.class, mappedBy = "sgpSbgrp" )
    public List< ErpGrpEetRpt > erpGrpEetRpts;

    //bi-directional many-to-one association to EstGrpEetStat
    @OneToMany( fetch = FetchType.LAZY, targetEntity = EstGrpEetStat.class, mappedBy = "sgpSbgrp" )
    public List< EstGrpEetStat > estGrpEetStats;

    //bi-directional many-to-one association to NtcNtrnlCntct
    @OneToMany( fetch = FetchType.LAZY, targetEntity = NtcNtrnlCntct.class, mappedBy = "sgpSbgrp" )
    public List< NtcNtrnlCntct > ntcNtrnlCntcts;

    //bi-directional many-to-one association to GrpGrp
    @ManyToOne
    @JoinColumns( { @JoinColumn( name = "CMS_SRC_SYS_CD", referencedColumnName = "CMS_SRC_SYS_CD", insertable = false, updatable = false ), @JoinColumn( name = "GRP_GRP_ID", referencedColumnName = "GRP_GRP_ID", insertable = false, updatable = false ) } )
    public GrpGrp grpGrp;

    private SgpSbgrp( SgpSbgrpBuilder builder ) {
        this.id = builder.id;
        this.cmsEmpGrpClfCd = builder.cmsEmpGrpClfCd;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.sgpBlngSbgrpId = builder.sgpBlngSbgrpId;
        this.sgpSgrpEfctvDt = builder.sgpSgrpEfctvDt;
        this.sgpSgrpTrmtnDt = builder.sgpSgrpTrmtnDt;
        this.sgpSlfBldInd = builder.sgpSlfBldInd;
        this.sgrSbgrpNmTxt = builder.sgrSbgrpNmTxt;
        this.actPrcops = builder.actPrcops;
        this.adpAlowblDeps = builder.adpAlowblDeps;
        this.erpGrpEetRpts = builder.erpGrpEetRpts;
        this.estGrpEetStats = builder.estGrpEetStats;
        this.ntcNtrnlCntcts = builder.ntcNtrnlCntcts;
        this.grpGrp = builder.grpGrp;
    }

    public static class SgpSbgrpBuilder {
        private SgpSbgrpPK id;
        private String cmsEmpGrpClfCd;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private String sgpBlngSbgrpId;
        private Timestamp sgpSgrpEfctvDt;
        private Timestamp sgpSgrpTrmtnDt;
        private short sgpSlfBldInd;
        private String sgrSbgrpNmTxt;
        private List< ActPrcop> actPrcops;
        private List< AdpAlowblDep> adpAlowblDeps;
        private List< ErpGrpEetRpt > erpGrpEetRpts;
        private List< EstGrpEetStat > estGrpEetStats;
        private List< NtcNtrnlCntct > ntcNtrnlCntcts;
        private GrpGrp grpGrp;

        public SgpSbgrpBuilder id( SgpSbgrpPK id ) {
            this.id = id;

            return this;
        }

        public SgpSbgrpBuilder cmsEmpGrpClfCd( String cmsEmpGrpClfCd ) {
            this.cmsEmpGrpClfCd = cmsEmpGrpClfCd;

            return this;
        }

        public SgpSbgrpBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public SgpSbgrpBuilder modifyUsusId ( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public SgpSbgrpBuilder sgpBlngSbgrpId( String sgpBlngSbgrpId ) {
            this.sgpBlngSbgrpId = sgpBlngSbgrpId;

            return this;
        }

        public SgpSbgrpBuilder sgpSgrpEfctvDt( Timestamp sgpSgrpEfctvDt ) {
            this.sgpSgrpEfctvDt = sgpSgrpEfctvDt;

            return this;
        }

        public SgpSbgrpBuilder sgpSgrpTrmtnDt( Timestamp sgpSgrpTrmtnDt ) {
            this.sgpSgrpTrmtnDt = sgpSgrpTrmtnDt;

            return this;
        }

        public SgpSbgrpBuilder sgpSlfBldInd( short sgpSlfBldInd ) {
            this.sgpSlfBldInd = sgpSlfBldInd;

            return this;
        }

        public SgpSbgrpBuilder sgrSbgrpNmTxt( String sgrSbgrpNmTxt ) {
            this.sgrSbgrpNmTxt = sgrSbgrpNmTxt;

            return this;
        }

        public SgpSbgrpBuilder actPrcops( List<ActPrcop> actPrcops ) {
            this.actPrcops = actPrcops;

            return this;
        }

        public SgpSbgrpBuilder adpAlowblDeps( List<AdpAlowblDep> adpAlowblDeps ) {
            this.adpAlowblDeps = adpAlowblDeps;

            return this;
        }

        public SgpSbgrpBuilder erpGrpEetRpts( List<ErpGrpEetRpt> erpGrpEetRpts ) {
            this.erpGrpEetRpts = erpGrpEetRpts;

            return this;
        }

        public SgpSbgrpBuilder estGrpEetStats( List<EstGrpEetStat> estGrpEetStats ) {
            this.estGrpEetStats = estGrpEetStats;

            return this;
        }

        public SgpSbgrpBuilder ntcNtrnlCntcts( List<NtcNtrnlCntct> ntcNtrnlCntcts ) {
            this.ntcNtrnlCntcts = ntcNtrnlCntcts;

            return this;
        }

        public SgpSbgrpBuilder grpGrp( GrpGrp grpGrp ) {
            this.grpGrp = grpGrp;

            return this;
        }

        public SgpSbgrp build() {
            return new SgpSbgrp( this );
        }
    }
}
