package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
@Table(name="TYP_CD_VW")
public class TypCdVw {

    @EmbeddedId
    private final TypCdVwKey typCdVwKey;

    @Column(name="CDCI_ITM_VER_NBR")
    private final short cdciItmVerNbr;

    @Column(name="CDCV_CD_VAL_NM")
    private final String cdcvCdValNm;

    @Column(name="CDCV_DESC_TXT")
    private final String cdcvDescTxt;

    @Column(name="CDIR_NTRNL_CD_NM")
    private final String cdirNtrnlCdNm;
}
