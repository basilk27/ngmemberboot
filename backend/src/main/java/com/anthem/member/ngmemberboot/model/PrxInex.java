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
@Table(name="PRX_INEX")
public class PrxInex {

    @EmbeddedId
    private PrxInexPK id;

    public PrxInex( PrxInexPK id ) {
        this.id = id;
    }

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="PRX_TRMNTN_DT")
    public Timestamp prxTrmntnDt;

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

    private PrxInex( PrxInexBuilder builder ) {
        this.id = builder.id;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.prxTrmntnDt = builder.prxTrmntnDt;
        this.epfGrpEetProfl = builder.epfGrpEetProfl;
    }

    public static class PrxInexBuilder {
        private PrxInexPK id;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private Timestamp prxTrmntnDt;
        private EpfGrpEetProfl epfGrpEetProfl;

        public PrxInexBuilder id( PrxInexPK id ) {
            this.id = id;

            return this;
        }

        public PrxInexBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public PrxInexBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public PrxInexBuilder prxTrmntnDt( Timestamp prxTrmntnDt ) {
            this.prxTrmntnDt = prxTrmntnDt;

            return this;
        }

        public PrxInexBuilder epfGrpEetProfl( EpfGrpEetProfl epfGrpEetProfl ) {
            this.epfGrpEetProfl = epfGrpEetProfl;

            return this;
        }

        public PrxInex build() {
            return new PrxInex( this );
        }
    }
}
