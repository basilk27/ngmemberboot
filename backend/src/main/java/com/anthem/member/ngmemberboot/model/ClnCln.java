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
@Table(name="CLN_CLN")
public class ClnCln {

    @EmbeddedId
    private ClnClnPK id;

    public ClnCln( ClnClnPK id ) {
        this.id = id;
    }

    @Column(name="CLN_CLNT_STAT_CD")
    public String clnClntStatCd;

    @Column(name="CLN_CLNT_TYP_CD")
    public String clnClntTypCd;

    @Column(name="CLN_CNTRC_CGRY_CD")
    public String clnCntrcCgryCd;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to GrpGrp
    @OneToMany(fetch = FetchType.LAZY, targetEntity = GrpGrp.class, mappedBy="clnCln")
    public List<GrpGrp> grpGrps;

    private ClnCln( ClnClnBuilder builder ) {
        this.id = builder.id;
        this.clnClntStatCd = builder.clnClntStatCd;
        this.clnClntTypCd = builder.clnClntTypCd;
        this.clnCntrcCgryCd = builder.clnCntrcCgryCd;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.grpGrps = builder.grpGrps;
    }

    public static class ClnClnBuilder {
        private ClnClnPK id;
        private String clnClntStatCd;
        private String clnClntTypCd;
        private String clnCntrcCgryCd;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private List<GrpGrp> grpGrps;

        public ClnClnBuilder id( ClnClnPK id ) {
            this.id = id;

            return this;
        }

        public ClnClnBuilder clnClntStatCd( String clnClntStatCd ) {
            this.clnClntStatCd = clnClntStatCd;

            return this;
        }

        public ClnClnBuilder clnClntTypCd( String clnClntTypCd ) {
            this.clnClntTypCd = clnClntTypCd;

            return this;
        }

        public ClnClnBuilder clnCntrcCgryCd( String clnCntrcCgryCd ) {
            this.clnCntrcCgryCd = clnCntrcCgryCd;

            return this;
        }

        public ClnClnBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public ClnClnBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public ClnClnBuilder grpGrps( List<GrpGrp> grpGrps ) {
            this.grpGrps = grpGrps;

            return this;
        }

        public ClnCln build() {
            return new ClnCln( this );
        }
    }
}
