package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EST_GRP_EET_STS_VW")
public class EstGrpEetStsVw {

    @EmbeddedId
    private final EstGrpEetStatPK id;

    public EstGrpEetStsVw( EstGrpEetStatPK id ) {
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
}
