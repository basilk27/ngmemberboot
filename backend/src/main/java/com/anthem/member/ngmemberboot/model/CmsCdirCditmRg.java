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
@Table(name="CMS_CDIR_CDITM_RGS")
public class CmsCdirCditmRg {

    @EmbeddedId
    private final CmsCdirCditmRgPK id;

    public CmsCdirCditmRg( CmsCdirCditmRgPK id ) {
        this.id = id;
    }

    @Column(name="CDCI_CD_ITM_ID")
    public int cdciCdItmId;

    @Column(name="CDCI_ITM_VER_NBR")
    public short cdciItmVerNbr;

    @Column(name="CDIR_RGSTN_TMS")
    public Timestamp cdirRgstnTms;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

}
