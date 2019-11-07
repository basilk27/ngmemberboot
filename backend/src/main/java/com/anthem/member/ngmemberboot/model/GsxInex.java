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
@Table(name="GSX_INEX")
public class GsxInex {

    @EmbeddedId
    private GsxInexPK id;

    public GsxInex( GsxInexPK id ) {
        this.id = id;
    }

    @Column(name="GSX_TRMNTN_DT")
    public Timestamp gsxTrmntnDt;

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

    private GsxInex( GsxInexBuilder builder ) {
        this.id = builder.id;
        this.gsxTrmntnDt = builder.gsxTrmntnDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.epfGrpEetProfl = builder.epfGrpEetProfl;
    }

    public static class GsxInexBuilder {
        private GsxInexPK id;
        private Timestamp gsxTrmntnDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private EpfGrpEetProfl epfGrpEetProfl;

        public GsxInexBuilder id( GsxInexPK id ) {
            this.id = id;

            return this;
        }

        public GsxInexBuilder gsxTrmntnDt( Timestamp gsxTrmntnDt ) {
            this.gsxTrmntnDt = gsxTrmntnDt;

            return this;
        }

        public GsxInexBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public GsxInexBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public GsxInexBuilder epfGrpEetProfl( EpfGrpEetProfl epfGrpEetProfl ) {
            this.epfGrpEetProfl = epfGrpEetProfl;

            return this;
        }

        public GsxInex build() {
            return new GsxInex( this );
        }
    }
}
