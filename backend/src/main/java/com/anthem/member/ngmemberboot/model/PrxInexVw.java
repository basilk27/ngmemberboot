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
@Table(name="PRX_INEX_VW")
public class PrxInexVw {

    @EmbeddedId
    private final PrxInexPK id;

    public PrxInexVw( PrxInexPK id ) {
        this.id = id;
    }

    @Column(name="EPF_EFCTV_DT")
    public Timestamp epfEfctvDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    @Column(name="PRX_TRMNTN_DT")
    public Timestamp prxTrmntnDt;
}
