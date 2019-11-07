package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EFD_FIL_DEFN_VW")
public class EfdFilDefnVw {

    @EmbeddedId
    private final EfdFilDefnPK id;

    public EfdFilDefnVw( EfdFilDefnPK id ) {
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

    @Column(name="EPF_EFCTV_DT")
    public Timestamp epfEfctvDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
