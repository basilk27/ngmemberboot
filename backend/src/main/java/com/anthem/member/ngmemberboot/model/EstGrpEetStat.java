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
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EST_GRP_EET_STAT")
public class EstGrpEetStat {

    @EmbeddedId
    private EstGrpEetStatPK id;

    public EstGrpEetStat( EstGrpEetStatPK id ) {
        this.id = id;
    }

    @Column(name="CMS_PRCS_LOCN_CD")
    public String cmsPrcsLocnCd;

    @Column(name="CMS_PRS_STS_MSG_CD")
    public String cmsPrsStsMsgCd;

    @Column(name="EST_BKUP_PREV_ENRLMNT_CNT")
    public BigDecimal estBkupPrevEnrlmntCnt;

    @Column(name="EST_ERR_TLRNC_LVL_PCT")
    public BigDecimal estErrTlrncLvlPct;

    @Column(name="EST_HDR_EFCTV_DT")
    public Timestamp estHdrEfctvDt;

    @Column(name="EST_PREV_ENRLMNT_CNT")
    public BigDecimal estPrevEnrlmntCnt;

    @Column(name="EST_STS_CRT_USR_ID")
    public String estStsCrtUsrId;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

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

    private EstGrpEetStat( EstGrpEetStatBuilder builder ) {
        this.id = builder.id;
        this.cmsPrcsLocnCd = builder.cmsPrcsLocnCd;
        this.cmsPrsStsMsgCd = builder.cmsPrsStsMsgCd;
        this.estBkupPrevEnrlmntCnt = builder.estBkupPrevEnrlmntCnt;
        this.estErrTlrncLvlPct = builder.estErrTlrncLvlPct;
        this.estHdrEfctvDt = builder.estHdrEfctvDt;
        this.estPrevEnrlmntCnt = builder.estPrevEnrlmntCnt;
        this.estStsCrtUsrId = builder.estStsCrtUsrId;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.sgpSbgrp = builder.sgpSbgrp;
    }

    public static class EstGrpEetStatBuilder {
        private EstGrpEetStatPK id;
        private String cmsPrcsLocnCd;
        private String cmsPrsStsMsgCd;
        private BigDecimal estBkupPrevEnrlmntCnt;
        private BigDecimal estErrTlrncLvlPct;
        private Timestamp estHdrEfctvDt;
        private BigDecimal estPrevEnrlmntCnt;
        private String estStsCrtUsrId;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private SgpSbgrp sgpSbgrp;

        public EstGrpEetStatBuilder id( EstGrpEetStatPK id ) {
            this.id = id;

            return this;
        }

        public EstGrpEetStatBuilder cmsPrcsLocnCd( String cmsPrcsLocnCd ) {
            this.cmsPrcsLocnCd = cmsPrcsLocnCd;

            return this;
        }

        public EstGrpEetStatBuilder cmsPrsStsMsgCd( String cmsPrsStsMsgCd ) {
            this.cmsPrsStsMsgCd = cmsPrsStsMsgCd;

            return this;
        }

        public EstGrpEetStatBuilder estBkupPrevEnrlmntCnt( BigDecimal estBkupPrevEnrlmntCnt ) {
            this.estBkupPrevEnrlmntCnt = estBkupPrevEnrlmntCnt;

            return this;
        }

        public EstGrpEetStatBuilder estErrTlrncLvlPct( BigDecimal estErrTlrncLvlPct ) {
            this.estErrTlrncLvlPct = estErrTlrncLvlPct;

            return this;
        }

        public EstGrpEetStatBuilder estHdrEfctvDt( Timestamp estHdrEfctvDt ) {
            this.estHdrEfctvDt = estHdrEfctvDt;

            return this;
        }

        public EstGrpEetStatBuilder estPrevEnrlmntCnt( BigDecimal estPrevEnrlmntCnt ) {
            this.estPrevEnrlmntCnt = estPrevEnrlmntCnt;

            return this;
        }

        public EstGrpEetStatBuilder estStsCrtUsrId( String estStsCrtUsrId ) {
            this.estStsCrtUsrId = estStsCrtUsrId;

            return this;
        }

        public EstGrpEetStatBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public EstGrpEetStatBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public EstGrpEetStatBuilder sgpSbgrp( SgpSbgrp sgpSbgrp ) {
            this.sgpSbgrp = sgpSbgrp;

            return this;
        }

        public EstGrpEetStat build() {
            return new EstGrpEetStat( this );
        }
    }
}
