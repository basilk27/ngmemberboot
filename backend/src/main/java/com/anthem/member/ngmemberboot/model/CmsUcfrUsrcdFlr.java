package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="CMS_UCFR_USRCD_FLR")
public class CmsUcfrUsrcdFlr {

    @EmbeddedId
    private CmsUcfrUsrcdFlrPK id;

    public CmsUcfrUsrcdFlr( CmsUcfrUsrcdFlrPK id ) {
        this.id = id;
    }

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="UCFR_FLTR_DESC_TXT")
    public String ucfrFltrDescTxt;

    //bi-directional many-to-one association to CmsUdcvUsrdfnd
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CDCI_CD_ITM_ID", referencedColumnName="CDCI_CD_ITM_ID",
                    insertable = false, updatable = false),
            @JoinColumn(name="CDCI_ITM_VER_NBR", referencedColumnName="CDCI_ITM_VER_NBR",
                    insertable = false, updatable = false),
            @JoinColumn(name="CDCV_DOMN_VAL", referencedColumnName="CDCV_DOMN_VAL",
                    insertable = false, updatable = false)
    })
    public CmsUdcvUsrdfnd cmsUdcvUsrdfnd;

}
