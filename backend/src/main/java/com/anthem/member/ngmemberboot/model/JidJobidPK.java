package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable
public class JidJobidPK implements Serializable {

    @Column(name="JID_JOB_ID")
    private final String jidJobId;

    @Column(name="CMS_SRC_SYS_CD")
    private final String cmsSrcSysCd;

    @Column(name="JID_EFCTV_DT")
    private final Timestamp jidEfctvDt;
}
