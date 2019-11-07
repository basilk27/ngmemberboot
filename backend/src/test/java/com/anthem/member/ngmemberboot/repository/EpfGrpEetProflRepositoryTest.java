package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.EpfGrpEetProfl;
import com.anthem.member.ngmemberboot.model.EpfGrpEetProflPK;
import lombok.Builder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

@RunWith( SpringRunner.class)
@DataJpaTest
public class EpfGrpEetProflRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private EpfGrpEetProflRepository epfGrpEetProflRepository;

    private Timestamp timestampNow;

    @Before
    public void setUp() throws Exception {
        Instant now = Instant.now();

        timestampNow = Timestamp.from( now );
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    @Sql( { "/sqlscripts/epfgrpeetproflschema.sql" } )
    public void EpfGrpEetProflBuilder() {
        //given
        System.out.println( "Jack" );
        /* bmk
        EpfGrpEetProfl epfGrpEetProfl = new EpfGrpEetProfl.EpfGrpEetProflBuilder()
                .id( new EpfGrpEetProflPK( "JOB01", "NOGROUP",
                        Constants.WGS20_CMS_SYSTEM_CODE, timestampNow ) )
                .sgpSbgrpId( "NOSUBGROUP" )
                .jidCmsSrcSysCd( null )
                .jidEfctvDt( null )
                .cmsEetPflStsCd( Constants.ACTIVE_JOBID_STATUS )
                .epfActvtyGdyQty( 2 )
                .epfAdrsChngInd( (short)1 )
                .epfAdrChgWbInd( (short)0 )
                .cmsPcpChngCd( "PRV01" )
                .cmsPdoChngCd( "PRV01" )
                .cmsNtwkChgCd( "NTK01" )
                .epfSscrbrTrmInd( (short)1 )
                .epfRptfrClmcInd( (short)1 )
                .epfRptfrClmrInd( (short)1 )
                .epfRptfuDeptInd( (short)1 )
                .epfRptfuEmplInd( (short)1 )
                .epfDepTrmInd( (short)1 )
                .epfRptfrClmcInd( (short)0 )
                .epfRptfrClmrInd( (short)0 )
                .epfRptfrDeptInd( (short)0 )
                .epfRptfrEmplInd( (short)0 )
                .epfPicPmgInd( (short)1 )
                .epfPicPcpInd( (short)1 )
                .epfPicPdoInd( (short)1 )
                .epfPicNtwkInd( (short)0 )
                .epfDfltPmgId( null )
                .epfDfltPcpId( "0ZZ" )
                .epfDfltPdoId( "000000" )
                .epfDfltNtwkId( null )
                .cmsEffDtChgCd( "CHGEN" )
                .cmsTrmDtChgCd( "CHGCN" )
                .cmsMdfEffDtCd( "N" )
                .cmsMdfTrmDtCd( "B" )
                .epfDepCvgInd( (short)1 )
                .cmsGenCobCd( "COB01" )
                .epfGenPrexInd( (short)1 )
                .epfDepUseInd( (short)1 )
                .epfRtrTrmMoQty( 0 )
                .epfRtrTrmMoInd( (short)0 )
                .epfRetroDayQty( 0 )
                .epfRetroDayInd( (short)0 )
                .cmsMdlInUseCd( "Y" )
                .epfRtrvClintInd( (short)0 )
                .epfCrtUsrId( null )
                .epfCrtDtTm( null )
                .epfOadPrcsInd( (short)0 )
                .cmsGrpTypPulCd( "ACR" )
                .epfPrvwInd( (short)0 )
                .epfTrmntnDt( null )
                .cmsPrflLvlCd( "CLNT" )
                .cmsAtTrmPrcsCd( "C" )
                .epfGenMdcrInd( (short)0 )
                .cmsDobSrcCd( "C" )
                .epfVdtspcPrvInd( (short)0 )
                .modifyUsusId( "ZTESTUSERID" )
                .modifyDtTm( timestampNow )
                .epfPcpRetroQty( 0 )
                .epfPdoRetroQty( 0 )
                .epfNtwkRetroQty( 0 )
                .epfDurnlCapInd( (short)1 )
                .cmsGrpsgpInexCd( "GSALF" )
                .cmsProdInexCd( "PRODA" )
                .cmsPrexEnddtCal( "I" )
                .epfAddrFlipInd( (short)0 )
                .cmsActnInexCd( "ACTNA" )
                .cmsProcesMeddCd( "MDNOT" )
                //.epfProcMdrskInd( null )
                .cmsAdrsRepl( "Y" )
                .cmsXrefDbChk( "Y" )
                .cmsPreExChg( "N" )
                .cmsHyphenNames( "N" )
                .cmsGenuAddSwch( "U" )
                .cmsGenuUpdSwch( "N" )
                .cmsAddCxldMbr( "N" )
                .cmsAupdPar( "N" )
                .cmsAupdFrstMthTerm( "N" )
                .cmsOvr45SsnExmpSw( "N" )
                .cmsCntyFromZipInd( "N" )
                .cmsSsbCd( "N" )
                .cmsPcpProvEpds2Ind("N" )
                .cmsSscrbrTrmInd( "M" )
                .cmsDepTrmInd( "Y" )
                .epfAupdRecCnt( BigDecimal.ZERO )
                .epfAupdAdds( BigDecimal.ZERO )
                .epfAupdChanges( BigDecimal.ZERO )
                .epfAupdExpTerm( BigDecimal.ZERO )
                .epfAupdImpTerm( BigDecimal.ZERO )
                .epfAupdDftPvdr( BigDecimal.ZERO )
                .epfAupdErrorsCnt( BigDecimal.ZERO )
                .cmsToleranceChkSw( "N" )
                .epfOvrdHdrDt( null )
                .cmsGrpTypeInd( "R" )
                .cmsDtOfHireInd( "N" )
                .epfMbrFrstNmChkInd( "Y" )
                .epfProvChngDt( null )
                .epfNtwkChngDt( null )
                .epfPrevEnrlmntCnt( BigDecimal.ZERO )
                .epfPrevEnrlmntCnt( BigDecimal.ZERO )
                .epfErrTlrncLvlPct( BigDecimal.ZERO )
                .epfHdrEfctvDt( null )
                .epfExchngNbr( (short)0 )
                // .epfExchngEntrprCd(  )    not set at default
                // .epfExchngNm(  )         not set at default
                // .epfCobOvrdInd(  )       not set at default
                .epfPcpErrSuppInd( "N" )
                .epfDupCovErrSuppInd( "N" )
                .epfBenEfctvDtInd( "A" )
                .build();

        //when
        EpfGrpEetProfl anEpfGrpEetProfl = epfGrpEetProflRepository.save( epfGrpEetProfl );

        //then
        assertThat( anEpfGrpEetProfl ).isNotNull();
        assertThat( anEpfGrpEetProfl.getId().getJidJobId() ).isEqualTo( "JOB01" );

        */
    }
}