package com.anthem.member.ngmemberboot.dto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SourceTransactionEnumTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void display_SourceTransaction_description() {
        SourceTransactionEnum sourceTransactionEnum1 = SourceTransactionEnum.valueOf( "D950" );
        SourceTransactionEnum sourceTransactionEnum2 = SourceTransactionEnum.valueOf( "FCETS" );
        SourceTransactionEnum sourceTransactionEnum3 = SourceTransactionEnum.valueOf( "M204" );
        SourceTransactionEnum sourceTransactionEnum4 = SourceTransactionEnum.valueOf( "QCARE" );
        SourceTransactionEnum sourceTransactionEnum5 = SourceTransactionEnum.valueOf( "STAR" );
        SourceTransactionEnum sourceTransactionEnum6 = SourceTransactionEnum.valueOf( "WGS13" );
        SourceTransactionEnum sourceTransactionEnum7 = SourceTransactionEnum.valueOf( "WGS20" );

        assertThat( sourceTransactionEnum1.getDescription() ).isEqualTo( "Diamond 950" );
        assertThat( sourceTransactionEnum2.getDescription() ).isEqualTo( "Facts System" );
        assertThat( sourceTransactionEnum3.getDescription() ).isEqualTo( "M204" );
        assertThat( sourceTransactionEnum4.getDescription() ).isEqualTo( "QCARE System" );
        assertThat( sourceTransactionEnum5.getDescription() ).isEqualTo( "STAR System" );
        assertThat( sourceTransactionEnum6.getDescription() ).isEqualTo( "WGS 1.3 System" );
        assertThat( sourceTransactionEnum7.getDescription() ).isEqualTo( "WGS 2.0 System" );
    }
}