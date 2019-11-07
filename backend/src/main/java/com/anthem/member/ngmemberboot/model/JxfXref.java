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
@Table(name="JXF_XREF")
public class JxfXref {

    @EmbeddedId
    private final JxfXref id;

    public JxfXref( JxfXref id ) {
        this.id = id;
    }

    @Column(name="JXF_TRMNTN_DT")
    public Timestamp jxfTrmntnDt;

    @Column(name="JID_JOB_ID")
    public String jidJobId;

    @Column(name="JID_EFCTV_DT")
    public Timestamp jidEfctvDt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to JidJobid
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name="CMS_SRC_SYS_CD", referencedColumnName="CMS_SRC_SYS_CD",
                        insertable = false, updatable = false),
            @JoinColumn(name="JID_EFCTV_DT", referencedColumnName="JID_EFCTV_DT",
                        insertable = false, updatable = false),
            @JoinColumn(name="JID_JOB_ID", referencedColumnName="JID_JOB_ID",
                        insertable = false, updatable = false)
    })
    public JidJobid jidJobid;

    private JxfXref( JxfXrefBuilder builder ) {
        this.id = builder.id;
        this.jxfTrmntnDt = builder.jxfTrmntnDt;
        this.jidJobId = builder.jidJobId;
        this.jidEfctvDt = builder.jidEfctvDt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.jidJobid = builder.jidJobid;
    }

    public static class JxfXrefBuilder {
        private JxfXref id;
        private Timestamp jxfTrmntnDt;
        private String jidJobId;
        private Timestamp jidEfctvDt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private JidJobid jidJobid;

        public JxfXrefBuilder id( JxfXref id ) {
            this.id = id;

            return  this;
        }

        public JxfXrefBuilder jxfTrmntnDt( Timestamp jxfTrmntnDt ) {
            this.jxfTrmntnDt = jxfTrmntnDt;

            return  this;
        }

        public JxfXrefBuilder jidJobId( String jidJobId ) {
            this.jidJobId = jidJobId;

            return  this;
        }

        public JxfXrefBuilder jidEfctvDt( Timestamp jidEfctvDt ) {
            this.jidEfctvDt = jidEfctvDt;

            return  this;
        }

        public JxfXrefBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return  this;
        }

        public JxfXrefBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return  this;
        }

        public JxfXrefBuilder jidJobid( JidJobid jidJobid ) {
            this.jidJobid = jidJobid;

            return  this;
        }

        public JxfXref build() {
            return new JxfXref( this );
        }
    }
}
