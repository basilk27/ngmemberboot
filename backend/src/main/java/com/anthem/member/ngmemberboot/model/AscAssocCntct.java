package com.anthem.member.ngmemberboot.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
@Table(name="ASC_ASSOC_CNTCT")
public class AscAssocCntct {

    @Id
    @Column(name="ASC_ASSOC_ID")
    private String ascAssocId;

    public AscAssocCntct( String ascAssocId ) {
        this.ascAssocId = ascAssocId;
    }

    @Column(name="ASC_CNTCT_AREA_CD")
    public String ascCntctAreaCd;

    @Column(name="ASC_CNTCT_PHN_EXT")
    public String ascCntctPhnExt;

    @Column(name="ASC_CNTCT_PHN_NBR")
    public String ascCntctPhnNbr;

    @Column(name="ASC_EMAL_ADR_TXT")
    public String ascEmalAdrTxt;

    @Column(name="ASC_FRST_NM_TXT")
    public String ascFrstNmTxt;

    @Column(name="ASC_LAST_NM_TXT")
    public String ascLastNmTxt;

    @Column(name="MODIFY_DT_TM")
    public Timestamp modifyDtTm;

    @Column(name="MODIFY_USUS_ID")
    public String modifyUsusId;

    //bi-directional many-to-one association to NtcNtrnlCntct
    @OneToMany(fetch = FetchType.LAZY, targetEntity = NtcNtrnlCntct.class, mappedBy="ascAssocCntct")
    public List<NtcNtrnlCntct> ntcNtrnlCntcts;

    private AscAssocCntct( AscAssocCntctBuilder builder ) {
        this.ascAssocId = builder.ascAssocId;
        this.ascCntctAreaCd = builder.ascCntctAreaCd;
        this.ascCntctPhnExt = builder.ascCntctPhnExt;
        this.ascCntctPhnNbr = builder.ascCntctPhnNbr;
        this.ascEmalAdrTxt = builder.ascEmalAdrTxt;
        this.ascFrstNmTxt = builder.ascFrstNmTxt;
        this.ascLastNmTxt = builder.ascLastNmTxt;
        this.modifyDtTm = builder.modifyDtTm;
        this.modifyUsusId = builder.modifyUsusId;
        this.ntcNtrnlCntcts = builder.ntcNtrnlCntcts;
    }

    public static class AscAssocCntctBuilder {
        private String ascAssocId;
        private String ascCntctAreaCd;
        private String ascCntctPhnExt;
        private String ascCntctPhnNbr;
        private String ascEmalAdrTxt;
        private String ascFrstNmTxt;
        private String ascLastNmTxt;
        private Timestamp modifyDtTm;
        private String modifyUsusId;
        private List<NtcNtrnlCntct> ntcNtrnlCntcts;


        public AscAssocCntctBuilder ascAssocId( String ascAssocId ) {
            this.ascAssocId = ascAssocId;

            return this;
        }

        public AscAssocCntctBuilder ascCntctAreaCd( String ascCntctAreaCd ) {
            this.ascCntctAreaCd = ascCntctAreaCd;

            return this;
        }

        public AscAssocCntctBuilder ascCntctPhnExt( String ascCntctPhnExt ) {
            this.ascCntctPhnExt = ascCntctPhnExt;

            return this;
        }

        public AscAssocCntctBuilder ascCntctPhnNbr( String ascCntctPhnNbr ) {
            this.ascCntctPhnNbr = ascCntctPhnNbr;

            return this;
        }

        public AscAssocCntctBuilder ascEmalAdrTxt( String ascEmalAdrTxt ) {
            this.ascEmalAdrTxt = ascEmalAdrTxt;

            return this;
        }

        public AscAssocCntctBuilder ascFrstNmTxt( String ascFrstNmTxt ) {
            this.ascFrstNmTxt = ascFrstNmTxt;

            return this;
        }

        public AscAssocCntctBuilder ascLastNmTxt( String ascLastNmTxt ) {
            this.ascLastNmTxt = ascLastNmTxt;

            return this;
        }

        public AscAssocCntctBuilder modifyDtTm( Timestamp modifyDtTm ) {
            this.modifyDtTm = modifyDtTm;

            return this;
        }

        public AscAssocCntctBuilder modifyUsusId( String modifyUsusId ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public AscAssocCntctBuilder modifyUsusId( List<NtcNtrnlCntct> ntcNtrnlCntcts ) {
            this.modifyUsusId = modifyUsusId;

            return this;
        }

        public AscAssocCntct build() {
            return new AscAssocCntct( this );
        }
    }
}
