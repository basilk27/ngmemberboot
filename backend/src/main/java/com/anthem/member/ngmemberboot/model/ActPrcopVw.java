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
@Table(name="ACT_PRCOP_VW")
public class ActPrcopVw {

    @EmbeddedId
    private final ActPrcopPK id;

    public ActPrcopVw( ActPrcopPK id ) {
        this.id = id;
    }

    @Column(name="ACT_PRCOP_IND")
    public short actPrcopInd;

    @Column(name="ACT_TRMNTN_DT")
    public Timestamp actTrmntnDt;

    @Column(name="EPF_EFCTV_DT")
    public Timestamp epfEfctvDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
