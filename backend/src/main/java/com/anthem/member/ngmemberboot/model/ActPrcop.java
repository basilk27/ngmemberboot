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
@Table(name="ACT_PRCOP")
public class ActPrcop {

    @EmbeddedId
    private ActPrcopPK id;

    public ActPrcop( ActPrcopPK id ) {
        this.id = id;
    }

    @Column(name="ACT_PRCOP_IND")
    public short actPrcopInd;

    @Column(name="ACT_TRMNTN_DT")
    public Timestamp actTrmntnDt;

    @Column(name="EPF_EFCTV_DT")
    public Timestamp epfEfctvDt;

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

    private ActPrcop( ActPrcopBuilder builder ) {
        this.id = builder.id;
        this.actPrcopInd = builder.actPrcopInd;
        this.actTrmntnDt = builder.actTrmntnDt;
        this.epfEfctvDt = builder.epfEfctvDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.sgpSbgrp = builder.sgpSbgrp;
    }

    public static class ActPrcopBuilder {
        private ActPrcopPK id;
        private short actPrcopInd;
        private Timestamp actTrmntnDt;
        private Timestamp epfEfctvDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private SgpSbgrp sgpSbgrp;

        public ActPrcopBuilder id( ActPrcopPK id ) {
            this.id = id;

            return this;
        }

        public ActPrcopBuilder actPrcopInd( short actPrcopInd ) {
            this.actPrcopInd = actPrcopInd;

            return this;
        }

        public ActPrcopBuilder actTrmntnDt( Timestamp actTrmntnDt ) {
            this.actTrmntnDt = actTrmntnDt;

            return this;
        }

        public ActPrcopBuilder epfEfctvDt( Timestamp epfEfctvDt ) {
            this.epfEfctvDt = epfEfctvDt;

            return this;
        }

        public ActPrcopBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public ActPrcopBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public ActPrcopBuilder sgpSbgrp( SgpSbgrp sgpSbgrp ) {
            this.sgpSbgrp = sgpSbgrp;

            return this;
        }

        public ActPrcop build() {
            return new ActPrcop( this );
        }
    }
}
