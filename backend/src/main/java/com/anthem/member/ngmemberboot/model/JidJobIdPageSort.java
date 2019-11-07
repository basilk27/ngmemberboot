package com.anthem.member.ngmemberboot.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="JID_JOBID")
@IdClass(JidJobidId.class)
public class JidJobIdPageSort {

    @Id
    @Column(name="JID_JOB_ID")
    private final String jidJobId;

    @Id
    @Column(name="CMS_SRC_SYS_CD")
    private final String cmsSrcSysCd;

    @Id
    @Column(name="JID_EFCTV_DT")
    private final Timestamp jidEfctvDt;

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

    //bi-directional many-to-one association to JxfXref
    @OneToMany(fetch = FetchType.LAZY, targetEntity = JxfXref.class, mappedBy="jidJobid")
    public List<JxfXref> jxfXrefs;
}
