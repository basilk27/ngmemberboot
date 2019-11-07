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
@Table(name="ADP_ALOWBL_DEP_VW")
public class AdpAlowblDepVw {

    @EmbeddedId
    private final AdpAlowblDepPK id;

    public AdpAlowblDepVw( AdpAlowblDepPK id ) {
        this.id = id;
    }

    @Column(name="ADP_TRMNTN_DT")
    public Timestamp adpTrmntnDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;
}
