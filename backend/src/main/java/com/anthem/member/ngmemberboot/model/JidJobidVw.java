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
@Table(name="JID_JOBID_VW")
public class JidJobidVw {

    @EmbeddedId
    private final JidJobidPK id;

    public JidJobidVw( JidJobidPK id ) {
        this.id = id;
    }

    @Column(name="JID_DESC_TXT")
    public String jidDescTxt;

    @Column(name="JID_JOBID_STAT_CD")
    public String jidJobidStatCd;

    @Column(name="JID_OWNER_ID")
    public String jidOwnerId;

    @Column(name="JID_TRMNTN_DT")
    public Timestamp jidTrmntnDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
