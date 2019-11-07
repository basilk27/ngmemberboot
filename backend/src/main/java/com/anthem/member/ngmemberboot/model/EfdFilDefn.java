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
@Table(name="EFD_FIL_DEFN")
public class EfdFilDefn {

    @EmbeddedId
    private EfdFilDefnPK id;

    public EfdFilDefn( EfdFilDefnPK id ) {
        this.id = id;
    }

    @Column(name="CMS_EET_FIL_MOD_CD")
    public String cmsEetFilModCd;

    @Column(name="CMS_EET_FIL_TYP_CD")
    public String cmsEetFilTypCd;

    @Column(name="CMS_EET_FMT_TYP_CD")
    public String cmsEetFmtTypCd;

    @Column(name="CMS_EET_SCHED_CD")
    public String cmsEetSchedCd;

    @Column(name="EFD_ER_TNC_LVL_PCT")
    public int efdErTncLvlPct;

    @Column(name="EFD_FIL_NM")
    public String efdFilNm;

    @Column(name="EFD_FTP_ADRS_TXT")
    public String efdFtpAdrsTxt;

    @Column(name="EFD_PRCS_ADTLN_DT")
    public Timestamp efdPrcsAdtlnDt;

    @Column(name="EFD_PRCS_DY_VAL")
    public int efdPrcsDyVal;

    @Column(name="EFD_RCRD_TLRNC_PCT")
    public int efdRcrdTlrncPct;

    @Column(name="EFD_TRMNTN_DT")
    public Timestamp efdTrmntnDt;

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

    private EfdFilDefn( EfdFilDefnBuilder builder ) {
        this.id = builder.id;
        this.cmsEetFilModCd = builder.cmsEetFilModCd;
        this.cmsEetFilTypCd = builder.cmsEetFilTypCd;
        this.cmsEetFmtTypCd = builder.cmsEetFmtTypCd;
        this.cmsEetSchedCd = builder.cmsEetSchedCd;
        this.efdErTncLvlPct = builder.efdErTncLvlPct;
        this.efdFilNm = builder.efdFilNm;
        this.efdFtpAdrsTxt = builder.efdFtpAdrsTxt;
        this.efdPrcsAdtlnDt = builder.efdPrcsAdtlnDt;
        this.efdPrcsDyVal = builder.efdPrcsDyVal;
        this.efdRcrdTlrncPct = builder.efdRcrdTlrncPct;
        this.efdTrmntnDt = builder.efdTrmntnDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.epfGrpEetProfl = builder.epfGrpEetProfl;
        this.grpGrp = builder.grpGrp;
    }

    public static class EfdFilDefnBuilder {
        private EfdFilDefnPK id;
        private String cmsEetFilModCd;
        private String cmsEetFilTypCd;
        private String cmsEetFmtTypCd;
        private String cmsEetSchedCd;
        private int efdErTncLvlPct;
        private String efdFilNm;
        private String efdFtpAdrsTxt;
        private Timestamp efdPrcsAdtlnDt;
        private int efdPrcsDyVal;
        private int efdRcrdTlrncPct;
        private Timestamp efdTrmntnDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private EpfGrpEetProfl epfGrpEetProfl;
        private GrpGrp grpGrp;


        public EfdFilDefnBuilder id( EfdFilDefnPK id ) {
            this.id = id;

            return this;
        }

        public EfdFilDefnBuilder cmsEetFilModCd( String cmsEetFilModCd ) {
            this.cmsEetFilModCd = cmsEetFilModCd;

            return this;
        }

        public EfdFilDefnBuilder cmsEetFilTypCd( String cmsEetFilTypCd ) {
            this.cmsEetFilTypCd = cmsEetFilTypCd;

            return this;
        }

        public EfdFilDefnBuilder cmsEetFmtTypCd( String cmsEetFmtTypCd ) {
            this.cmsEetFmtTypCd = cmsEetFmtTypCd;

            return this;
        }

        public EfdFilDefnBuilder cmsEetSchedCd( String cmsEetSchedCd ) {
            this.cmsEetSchedCd = cmsEetSchedCd;

            return this;
        }

        public EfdFilDefnBuilder efdErTncLvlPct( int efdErTncLvlPct ) {
            this.efdErTncLvlPct = efdErTncLvlPct;

            return this;
        }

        public EfdFilDefnBuilder efdFilNm( String efdFilNm ) {
            this.efdFilNm = efdFilNm;

            return this;
        }

        public EfdFilDefnBuilder efdFtpAdrsTxt( String efdFtpAdrsTxt ) {
            this.efdFtpAdrsTxt = efdFtpAdrsTxt;

            return this;
        }

        public EfdFilDefnBuilder efdPrcsAdtlnDt( Timestamp efdPrcsAdtlnDt ) {
            this.efdPrcsAdtlnDt = efdPrcsAdtlnDt;

            return this;
        }

        public EfdFilDefnBuilder efdPrcsDyVal( int efdPrcsDyVal ) {
            this.efdPrcsDyVal = efdPrcsDyVal;

            return this;
        }

        public EfdFilDefnBuilder efdRcrdTlrncPct( int efdRcrdTlrncPct ) {
            this.efdRcrdTlrncPct = efdRcrdTlrncPct;

            return this;
        }

        public EfdFilDefnBuilder efdTrmntnDt( Timestamp efdTrmntnDt ) {
            this.efdTrmntnDt = efdTrmntnDt;

            return this;
        }

        public EfdFilDefnBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public EfdFilDefnBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public EfdFilDefnBuilder epfGrpEetProfl( EpfGrpEetProfl epfGrpEetProfl ) {
            this.epfGrpEetProfl = epfGrpEetProfl;

            return this;
        }

        public EfdFilDefnBuilder grpGrp( GrpGrp grpGrp ) {
            this.grpGrp = grpGrp;

            return this;
        }

        public EfdFilDefn build() {
            return new EfdFilDefn( this );
        }
    }
}
