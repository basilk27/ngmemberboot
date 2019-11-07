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
public class CmsCdirCditmRgPK implements Serializable {

    @Column(name="APLC_PGM_ID")
    private final String aplcPgmId;

    @Column(name="CDIR_NTRNL_CD_NM")
    private final String cdirNtrnlCdNm;
}
