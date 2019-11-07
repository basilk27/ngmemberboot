package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EDF_EET_RPT_DEFN")
public class EdfEetRptDefn {

    @EmbeddedId
    private EdfEetRptDefnPK id;

    public EdfEetRptDefn( EdfEetRptDefnPK id ) {
        this.id = id;
    }

    @Column(name="CMS_RPT_DAT_TYP_CD")
    public String cmsRptDatTypCd;

    @Column(name="EDF_RPT_NM")
    public String edfRptNm;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to ErpGrpEetRpt
    @OneToMany(fetch = FetchType.LAZY, targetEntity = ErpGrpEetRpt.class, mappedBy="edfEetRptDefn")
    public List<ErpGrpEetRpt> erpGrpEetRpts;
}
