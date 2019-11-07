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
@Table(name="CLN_CLN_VW")
public class ClnClnVw {

    @EmbeddedId
    private final ClnClnPK id;

    public ClnClnVw( ClnClnPK id ) {
        this.id = id;
    }

    @Column(name="CLN_CLNT_STAT_CD")
    public String clnClntStatCd;

    @Column(name="CLN_CLNT_TYP_CD")
    public String clnClntTypCd;

    @Column(name="CLN_CNTRC_CGRY_CD")
    public String clnCntrcCgryCd;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
