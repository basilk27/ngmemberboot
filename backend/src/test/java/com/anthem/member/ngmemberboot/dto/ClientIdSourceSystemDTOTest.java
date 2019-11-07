package com.anthem.member.ngmemberboot.dto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ClientIdSourceSystemDTOTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void builder() {
        ClientIdSourceSystemDTO dto = ClientIdSourceSystemDTO
                .builder()
                .userId( "AF88034" )
                .jobId( "JOB27" )
                .sourceSystem( "WGS20" )
                .description( "Testing description" )
                .build();

        assertThat( dto ).isNotNull();
        assertThat( dto.getJobId() ).isEqualTo( "JOB27" );
        assertThat( dto.getUserId() ).isEqualTo( "AF88034" );
    }
}