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
public class GrpGrpPK implements Serializable {

    @Column(name="GRP_GRP_ID")
    private final String grpGrpId;

    @Column(name="CMS_SRC_SYS_CD")
    private final String cmsSrcSysCd;
}
