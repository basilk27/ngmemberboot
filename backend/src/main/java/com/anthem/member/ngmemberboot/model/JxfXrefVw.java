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
@Table(name="JXF_XREF_VW")
public class JxfXrefVw {

    @EmbeddedId
    private final JxfXrefPK id;

    public JxfXrefVw( JxfXrefPK id ) {
        this.id = id;
    }

    @Column(name="JID_EFCTV_DT")
    public Timestamp jidEfctvDt;

    @Column(name="JID_JOB_ID")
    public String jidJobId;

    @Column(name="JXF_TRMNTN_DT")
    public Timestamp jxfTrmntnDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
