package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.sql.Timestamp;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="EPF_GRP_EET_RPT_VW")
public class EpfGrpEetRptVw {

    @EmbeddedId
    private final ErpGrpEetRptPK id;

    public EpfGrpEetRptVw( ErpGrpEetRptPK id ) {
        this.id = id;
    }

    @Column(name="ERP_ROWID")
    public byte[] erpRowid;

    @Column(name="ERP_RPT_CRT_USR_ID")
    public String erpRptCrtUsrId;

    @Lob
    @Column(name="ERP_RPT_DAT_TXT")
    public byte[] erpRptDatTxt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
