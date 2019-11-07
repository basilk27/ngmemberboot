package com.anthem.member.ngmemberboot.service;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.dto.ClientIdSourceSystemDTO;
import com.anthem.member.ngmemberboot.dto.SystemSource;
import com.anthem.member.ngmemberboot.dto.UserInfo;
import com.anthem.member.ngmemberboot.helppers.JidJobIdHelper;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.JidJobidPK;
import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.model.TypCdVwKey;
import com.anthem.member.ngmemberboot.repository.JidJobidRepository;
import com.anthem.member.ngmemberboot.repository.TypCdVwRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;

@RunWith( SpringRunner.class )
@SpringBootTest
public class ClientMaintenanceImplTest {

    private JidJobid jidJobid;
    private JidJobid jidJobid2;
    private ClientIdSourceSystemDTO dto;
    private Timestamp jidEfctvDt;
    private List<JidJobid> jidJobidNullList;
    private JidJobid createdJidJobid;

    @Mock
    private JidJobidRepository jobidRepository;

    @Mock
    private TypCdVwRepository typCdVwRepository;

    private List<TypCdVw>  typCdVwList;

    private JidJobIdHelper jidJobIdHelper;

    private ClientMaintServiceImpl clientMaintServiceImpl;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks( this );

        clientMaintServiceImpl = new ClientMaintServiceImpl( jobidRepository, typCdVwRepository );

        jidJobidNullList = null;

        Instant now = Instant.now();

        jidEfctvDt = Timestamp.from( now );

        jidJobid = new JidJobid.JidJobIdBuilder()
                .id( new JidJobidPK( "BMK4", "WGS20", jidEfctvDt ) )
                .jidTrmntnDt( null )
                .jidJobidStatCd( Constants.ACTIVE_JOBID_STATUS )
                .jidOwnerId( "AF88034" )
                .modifyUsusId( "AF88034" )
                .modifyDtTm( jidEfctvDt )
                .jidDescTxt( "Testing" )
                .build();


        jidJobid2 = new JidJobid.JidJobIdBuilder()
                .id( new JidJobidPK( "BMK4", "WGS20", jidEfctvDt ) )
                .jidTrmntnDt( null )
                .jidJobidStatCd( Constants.ACTIVE_JOBID_STATUS )
                .jidOwnerId( "AF88034" )
                .modifyUsusId( "AF88034" )
                .modifyDtTm( jidEfctvDt )
                .jidDescTxt( "Testing" )
                .build();

        dto = ClientIdSourceSystemDTO
                .builder()
                .userId( "AF88034" )
                .jobId( "JOB27" )
                .sourceSystem( "WGS20" )
                .description( "Testing Description" )
                .build();

        jidJobIdHelper = new JidJobIdHelper( dto );

        createdJidJobid = jidJobIdHelper.createJidJobId();

        typCdVwList = initTypCdVwList();
    }

    private List<TypCdVw> initTypCdVwList() {

        typCdVwList = new ArrayList<>();

        TypCdVw typCdVw1 = new TypCdVw( new TypCdVwKey( 1286, "D950", "EET" ));

        typCdVw1.setCdcvCdValNm( "SRC=D950" );
        typCdVw1.setCdcvDescTxt( "The source of this transaction is the Diamond 950" );
        typCdVw1.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw1 );

        TypCdVw typCdVw2 = new TypCdVw( new TypCdVwKey( 1286, "FACETS", "EET" ));

        typCdVw2.setCdcvCdValNm( "SRC=FACETS" );
        typCdVw2.setCdcvDescTxt( "The source of this transaction is the Facets System" );
        typCdVw2.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw2 );

        TypCdVw typCdVw3 = new TypCdVw( new TypCdVwKey( 1286, "M204", "EET" ));

        typCdVw3.setCdcvCdValNm( "SRC=M204" );
        typCdVw3.setCdcvDescTxt( "The transaction source system code is M204" );
        typCdVw3.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw3 );

        TypCdVw typCdVw4 = new TypCdVw( new TypCdVwKey( 1286, "QCare", "EET" ));

        typCdVw4.setCdcvCdValNm( "SRC=QCare" );
        typCdVw4.setCdcvDescTxt( "The source of this transaction is the QCare System" );
        typCdVw4.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw4 );

        TypCdVw typCdVw5 = new TypCdVw( new TypCdVwKey( 1286, "STAR", "EET" ));

        typCdVw5.setCdcvCdValNm( "SRC=STAR" );
        typCdVw5.setCdcvDescTxt( "The source of this transaction is the STAR System" );
        typCdVw5.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw5 );

        TypCdVw typCdVw6 = new TypCdVw( new TypCdVwKey( 1286, "WGS13", "EET" ));

        typCdVw6.setCdcvCdValNm( "SRC=WGS13" );
        typCdVw6.setCdcvDescTxt( "The source of this transaction is the WGS 1.3 System" );
        typCdVw6.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw6 );

        TypCdVw typCdVw7 = new TypCdVw( new TypCdVwKey( 1286, "WGS20", "EET" ));

        typCdVw7.setCdcvCdValNm( "SRC=WGS20" );
        typCdVw7.setCdcvDescTxt( "The source of this transaction is the WGS 2.0 System" );
        typCdVw7.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw7 );

        return typCdVwList;
    }


    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void loadCreateClientResource() {
        //given
        given( typCdVwRepository.findTypCdVwsByTypCdVwKey_CdciCdItmIdAndTypCdVwKey_UcfrFltrVal( anyInt(), anyString()) ).willReturn( typCdVwList );

        //when
        List<SystemSource> systemSourceList = clientMaintServiceImpl.findSystemSources();

        //then
        assertThat( systemSourceList.size() ).isEqualTo( 1 );
    }

    @Test
    public void createEmployerClientId() {
        //given
        given( jobidRepository.findJidJobidsById_CmsSrcSysCdAndAndId_JidJobId( anyString(), anyString()) )
                .willReturn(jidJobidNullList  );
        given( jobidRepository.save(any( JidJobid.class )) ).willReturn( createdJidJobid );

        //when
        jidJobid2 = clientMaintServiceImpl.createEmployerJobId( dto );

        //then
        assertThat( jidJobid2 ).isNotNull();
        assertThat( jidJobid2.getId().getJidJobId() ).isEqualTo( createdJidJobid.getId().getJidJobId() );
        assertThat( jidJobid2.getId().getCmsSrcSysCd() ).isEqualTo( createdJidJobid.getId().getCmsSrcSysCd() );
    }

    @Test
    public void viewEmployerClientId() {
        //given
        //when
        //then
    }

    @Test
    public void updateEmployerClientId() {
        //given
        //when
        //then
    }
}