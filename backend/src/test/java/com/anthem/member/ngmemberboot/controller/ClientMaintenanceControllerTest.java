package com.anthem.member.ngmemberboot.controller;

import com.anthem.member.ngmemberboot.dto.SystemSource;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.model.TypCdVwKey;
import com.anthem.member.ngmemberboot.service.ClientMaintService;
import com.anthem.member.ngmemberboot.service.ClientMaintServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith( SpringRunner.class )
@WebMvcTest(ClientMaintenanceController.class)
public class ClientMaintenanceControllerTest {

    @Autowired
    private MockMvc mvc;

    private JacksonTester<List<TypCdVw>> listJacksonTester;
    private JacksonTester<JidJobid> jidJobidJacksonTester;
    private JacksonTester<List<SystemSource>> listSysSourceJacksonTester;
    private List<TypCdVw> typCdVwList;
    private List<SystemSource> systemSourceList;

    @MockBean
    private ClientMaintServiceImpl clientMaintService;

    @Before
    public void setUp() throws Exception {
        JacksonTester.initFields( this, new ObjectMapper() );

        initTypCdVwList();

        initSystemSource();
    }

    private void initTypCdVwList() {

        typCdVwList = new ArrayList<>();

        TypCdVw typCdVw1 = new TypCdVw( new TypCdVwKey( 1286, "D950", "EET" ));

        typCdVw1.setCdcvCdValNm( "SRC=D950" );
        typCdVw1.setCdcvDescTxt( "The source of this transaction is the Diamond 950" );
        typCdVw1.setCdirNtrnlCdNm( "Transaction Source System" );

        typCdVwList.add( typCdVw1 );

        TypCdVw typCdVw2 = new TypCdVw( new TypCdVwKey( 1286, "FCETS", "EET" ));

        typCdVw2.setCdcvCdValNm( "SRC=FCETS" );
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
    }

    private void initSystemSource() {
        systemSourceList = new ArrayList<>();

        systemSourceList.add( new SystemSource( "D950", "Diamond 950" ) );
        systemSourceList.add( new SystemSource( "FCETS", "Facets Systems" ) );
        systemSourceList.add( new SystemSource( "M204", "M204" ) );
        systemSourceList.add( new SystemSource( "QCARE", "QCARE System" ) );
        systemSourceList.add( new SystemSource( "STAR", "STAR System" ) );
        systemSourceList.add( new SystemSource( "WGS13", "WGS 1.3 System" ) );
        systemSourceList.add( new SystemSource( "WGS20", "WGS 1.3 System" ) );
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findSystemSources() throws Exception {
        //when
        given( clientMaintService.findSystemSources() ).willReturn( systemSourceList );

        MockHttpServletResponse response = mvc.perform( MockMvcRequestBuilders
                .get( "/membership-server/v1/typcdvws")
                .accept( MediaType.APPLICATION_JSON ) )
                .andReturn()
                .getResponse();

        //then
        assertThat( response.getStatus() ).isEqualTo( HttpStatus.OK.value() );

        System.out.println( response.getContentAsString() );

    }

    @Test
    public void createEmployerJob() {
    }
}