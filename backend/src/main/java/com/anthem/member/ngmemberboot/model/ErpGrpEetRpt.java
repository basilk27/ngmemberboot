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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="ERP_GRP_EET_RPT")
public class ErpGrpEetRpt {

    @EmbeddedId
    private ErpGrpEetRptPK id;

    public ErpGrpEetRpt( ErpGrpEetRptPK id ) {
        this.id = id;
    }

    @Column(name="ERP_ROWID")
    public byte[] erpRowid;

    @Column(name="ERP_RPT_CRT_USR_ID")
    public String erpRptCrtUsrId;

    @Lob
    @Column(name="ERP_RPT_DAT_TXT")
    public byte[] erpRptDatTxt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to EdfEetRptDefn
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="EDF_EET_RPT_ID", referencedColumnName="EDF_EET_RPT_ID",
                    insertable = false, updatable = false),
            @JoinColumn(name="JID_JOB_ID", referencedColumnName="JID_JOB_ID",
                    insertable = false, updatable = false)
    })
    public EdfEetRptDefn edfEetRptDefn;

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

    private ErpGrpEetRpt( ErpGrpEetRptBuilder builder ) {
        this.id = builder.id;
        this.erpRowid = builder.erpRowid;
        this.erpRptCrtUsrId = builder.erpRptCrtUsrId;
        this.erpRptDatTxt = builder.erpRptDatTxt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.edfEetRptDefn = builder.edfEetRptDefn;
        this.sgpSbgrp = builder.sgpSbgrp;
    }

    public static class ErpGrpEetRptBuilder {
        private ErpGrpEetRptPK id;
        private byte[] erpRowid;
        private String erpRptCrtUsrId;
        private byte[] erpRptDatTxt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private EdfEetRptDefn edfEetRptDefn;
        private SgpSbgrp sgpSbgrp;

        public ErpGrpEetRptBuilder id( ErpGrpEetRptPK id ) {
            this.id = id;

            return  this;
        }

        public ErpGrpEetRptBuilder erpRowid( byte[] erpRowid ) {
            this.erpRowid = erpRowid;

            return  this;
        }

        public ErpGrpEetRptBuilder erpRptCrtUsrId( String erpRptCrtUsrId ) {
            this.erpRptCrtUsrId = erpRptCrtUsrId;

            return  this;
        }

        public ErpGrpEetRptBuilder erpRptDatTxt( byte[] erpRptDatTxt ) {
            this.erpRptDatTxt = erpRptDatTxt;

            return  this;
        }

        public ErpGrpEetRptBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return  this;
        }

        public ErpGrpEetRptBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return  this;
        }

        public ErpGrpEetRptBuilder edfEetRptDefn( EdfEetRptDefn edfEetRptDefn ) {
            this.edfEetRptDefn = edfEetRptDefn;

            return  this;
        }

        public ErpGrpEetRptBuilder sgpSbgrp( SgpSbgrp sgpSbgrp ) {
            this.sgpSbgrp = sgpSbgrp;

            return  this;
        }

        public ErpGrpEetRpt build() {
            return new ErpGrpEetRpt( this );
        }
    }
}
