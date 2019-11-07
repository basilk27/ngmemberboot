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
@Table(name="JID_JOBID")
public class JidJobid {

    @EmbeddedId
    private final JidJobidPK id;

    public JidJobid( JidJobidPK id ) {
        this.id = id;
    }

    @Column(name="JID_DESC_TXT")
    public String jidDescTxt;

    @Column(name="JID_JOBID_STAT_CD")
    public String jidJobidStatCd;

    @Column(name="JID_OWNER_ID")
    public String jidOwnerId;

    @Column(name="JID_TRMNTN_DT")
    public Timestamp jidTrmntnDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to JxfXref
    @OneToMany(fetch = FetchType.LAZY, targetEntity = JxfXref.class, mappedBy="jidJobid")
    public List<JxfXref> jxfXrefs;

    private JidJobid( JidJobIdBuilder builder ) {
        this.id = builder.id;
        this.jidDescTxt = builder.jidDescTxt;
        this.jidJobidStatCd = builder.jidJobidStatCd;
        this.jidOwnerId = builder.jidOwnerId;
        this.jidTrmntnDt = builder.jidTrmntnDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.jxfXrefs = builder.jxfXrefs;
    }

    public static class JidJobIdBuilder {
        private JidJobidPK id;
        private String jidDescTxt;
        private String jidJobidStatCd;
        private String jidOwnerId;
        private Timestamp jidTrmntnDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private List<JxfXref> jxfXrefs;

        public JidJobIdBuilder id( final  JidJobidPK id ) {
            this.id = id;

            return this;
        }

        public JidJobIdBuilder jidDescTxt( String jidDescTxt ) {
            this.jidDescTxt = jidDescTxt;

            return this;
        }

        public JidJobIdBuilder jidJobidStatCd( String jidJobidStatCd ) {
            this.jidJobidStatCd = jidJobidStatCd;

            return this;
        }

        public JidJobIdBuilder jidOwnerId( String jidOwnerId ) {
            this.jidOwnerId = jidOwnerId;

            return this;
        }

        public JidJobIdBuilder jidTrmntnDt( Timestamp jidTrmntnDt ) {
            this.jidTrmntnDt = jidTrmntnDt;

            return this;
        }

        public JidJobIdBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public JidJobIdBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public JidJobIdBuilder jxfXrefs( List<JxfXref> jxfXrefs ) {
            this.jxfXrefs = jxfXrefs;

            return this;
        }

        public JidJobid build() {
            return new JidJobid( this );
        }
    }
}
