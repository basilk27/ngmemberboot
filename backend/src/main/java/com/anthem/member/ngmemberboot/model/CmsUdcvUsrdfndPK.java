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
public class CmsUdcvUsrdfndPK implements Serializable {

    @Column(name="CDCI_CD_ITM_ID")
    private final int cdciCdItmId;

    @Column(name="CDCI_ITM_VER_NBR")
    private final short cdciItmVerNbr;

    @Column(name="CDCV_DOMN_VAL")
    private final String cdcvDomnVal;
}
