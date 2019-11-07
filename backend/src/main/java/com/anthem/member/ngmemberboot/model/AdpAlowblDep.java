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
@Table(name="ADP_ALOWBL_DEP")
public class AdpAlowblDep {

    @EmbeddedId
    private AdpAlowblDepPK id;

    public AdpAlowblDep( AdpAlowblDepPK id ) {
        this.id = id;
    }

    @Column(name="ADP_TRMNTN_DT")
    public Timestamp adpTrmntnDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to GrpGrp
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CMS_SRC_SYS_CD", referencedColumnName="CMS_SRC_SYS_CD",
                    insertable = false, updatable = false),
            @JoinColumn(name="GRP_GRP_ID", referencedColumnName="GRP_GRP_ID",
                    insertable = false, updatable = false)
    })
    public GrpGrp grpGrp;

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

    private AdpAlowblDep( AdpAlowblDepBuilder builder ) {
        this.id = builder.id;
        this.adpTrmntnDt = builder.adpTrmntnDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.grpGrp = builder.grpGrp;
        this.sgpSbgrp = builder.sgpSbgrp;
    }

    public static class AdpAlowblDepBuilder {
        private AdpAlowblDepPK id;
        private Timestamp adpTrmntnDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private GrpGrp grpGrp;
        private SgpSbgrp sgpSbgrp;

        public AdpAlowblDepBuilder id( AdpAlowblDepPK id ) {
            this.id = id;

            return this;
        }

        public AdpAlowblDepBuilder adpTrmntnDt( Timestamp adpTrmntnDt ) {
            this.adpTrmntnDt = adpTrmntnDt;

            return this;
        }

        public AdpAlowblDepBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public AdpAlowblDepBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public AdpAlowblDepBuilder grpGrp( GrpGrp grpGrp ) {
            this.grpGrp = grpGrp;

            return this;
        }

        public AdpAlowblDepBuilder sgpSbgrp( SgpSbgrp sgpSbgrp ) {
            this.sgpSbgrp = sgpSbgrp;

            return this;
        }

        public AdpAlowblDep build() {
            return new AdpAlowblDep( this );
        }
    }
}
