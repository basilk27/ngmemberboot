package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Embeddable
public class EdfEetRptDefnPK implements Serializable {

    @Column(name="JID_JOB_ID")
    private final String jidJobId;

    @Column(name="EDF_EET_RPT_ID")
    private final String edfEetRptId;
}
