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
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="TYP_CD_VW")
public class TypCdVw {

    @EmbeddedId
    private final TypCdVwKey typCdVwKey;

    public TypCdVw( TypCdVwKey typCdVwKey ) {
        this.typCdVwKey = typCdVwKey;
    }

    @Column(name="CDCI_ITM_VER_NBR")
    public short cdciItmVerNbr;

    @Column(name="CDCV_CD_VAL_NM")
    public String cdcvCdValNm;

    @Column(name="CDCV_DESC_TXT")
    public String cdcvDescTxt;

    @Column(name="CDIR_NTRNL_CD_NM")
    public String cdirNtrnlCdNm;
}
