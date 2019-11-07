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
@Table(name="EPF_GRP_XREF_TBL")
public class EpfGrpXrefTbl {

    @EmbeddedId
    private final EpfGrpXrefTblPK id;

    public EpfGrpXrefTbl( EpfGrpXrefTblPK id ) {
        this.id = id;
    }

    @Column(name="EPF_ADD_DT_TM")
    public Timestamp epfAddDtTm;

    @Column(name="EPF_ADD_USER_ID")
    public String epfAddUserId;

    @Column(name="EPF_INPT_DISP_CD")
    public String epfInptDispCd;

    @Column(name="EPF_INPT_MBR_TYPE_CD")
    public String epfInptMbrTypeCd;

    @Column(name="EPF_INPT_REC_TYPE_CD")
    public String epfInptRecTypeCd;

    @Column(name="EPF_WGS_DISP_CD")
    public String epfWgsDispCd;

    @Column(name="EPF_WGS_GRP_NM")
    public String epfWgsGrpNm;

    @Column(name="EPF_WGS_MBR_TYPE_CD")
    public String epfWgsMbrTypeCd;

    @Column(name="EPF_WGS_REC_TYPE_CD")
    public String epfWgsRecTypeCd;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USER_ID")
    public String modifyUserId;
}
