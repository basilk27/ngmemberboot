package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

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
@Table(name="NTC_NTRNL_CNTCT")
public class NtcNtrnlCntct {

    @EmbeddedId
    private NtcNtrnlCntctPK id;

    public NtcNtrnlCntct( NtcNtrnlCntctPK id ) {
        this.id = id;
    }

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="NTC_CTCT_EFCTV_DT")
    public Timestamp ntcCtctEfctvDt;

    @Column(name="NTC_CTCT_TRMNTN_DT")
    public Timestamp ntcCtctTrmntnDt;

    @Column(name="NTC_PRMY_CNTCT_IND")
    public String ntcPrmyCntctInd;

    //bi-directional many-to-one association to AscAssocCntct
    @ManyToOne
    @JoinColumn(name="ASC_ASSOC_ID", insertable = false, updatable = false)
    public AscAssocCntct ascAssocCntct;

    //bi-directional many-to-one association to SgpSbgrp
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CMS_SRC_SYS_CD", referencedColumnName="CMS_SRC_SYS_CD",
                    insertable = false, updatable = false),
            @JoinColumn(name="GRP_GRP_ID", referencedColumnName="GRP_GRP_ID",
                    insertable = false, updatable = false),
            @JoinColumn(name="SGP_SBGRP_ID", referencedColumnName="SGP_SBGRP_ID",
                    insertable = false, updatable = false)
    })
    public SgpSbgrp sgpSbgrp;

    private NtcNtrnlCntct( NtcNtrnlCntctBuilder builder ) {
        this.id = builder.id;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.ntcCtctEfctvDt = builder.ntcCtctEfctvDt;
        this.ntcCtctTrmntnDt = builder.ntcCtctTrmntnDt;
        this.ntcPrmyCntctInd = builder.ntcPrmyCntctInd;
        this.ascAssocCntct = builder.ascAssocCntct;
        this.sgpSbgrp = builder.sgpSbgrp;
    }

    public static class NtcNtrnlCntctBuilder {
        private NtcNtrnlCntctPK id;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private Timestamp ntcCtctEfctvDt;
        private Timestamp ntcCtctTrmntnDt;
        private String ntcPrmyCntctInd;
        private AscAssocCntct ascAssocCntct;
        private SgpSbgrp sgpSbgrp;

        public NtcNtrnlCntctBuilder id( NtcNtrnlCntctPK id ) {
            this.id = id;

            return this;
        }

        public NtcNtrnlCntctBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public NtcNtrnlCntctBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public NtcNtrnlCntctBuilder ntcCtctEfctvDt( Timestamp ntcCtctEfctvDt ) {
            this.ntcCtctEfctvDt = ntcCtctEfctvDt;

            return this;
        }

        public NtcNtrnlCntctBuilder ntcCtctTrmntnDt( Timestamp ntcCtctTrmntnDt ) {
            this.ntcCtctTrmntnDt = ntcCtctTrmntnDt;

            return this;
        }

        public NtcNtrnlCntctBuilder ntcPrmyCntctInd( String ntcPrmyCntctInd ) {
            this.ntcPrmyCntctInd = ntcPrmyCntctInd;

            return this;
        }

        public NtcNtrnlCntctBuilder ascAssocCntct( AscAssocCntct ascAssocCntct ) {
            this.ascAssocCntct = ascAssocCntct;

            return this;
        }

        public NtcNtrnlCntctBuilder sgpSbgrp( SgpSbgrp sgpSbgrp ) {
            this.sgpSbgrp = sgpSbgrp;

            return this;
        }

        public NtcNtrnlCntct build() {
            return new NtcNtrnlCntct( this );
        }
    }
}
