package com.anthem.member.ngmemberboot.model;

import com.anthem.member.ngmemberboot.exceptions.ErrorDetail;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.time.Instant;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class GrpGrpTest {

    private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static SecureRandom rnd = new SecureRandom();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createGrpGrpTest() {
        GrpGrp grpGrp = new GrpGrp();

        assertThat( grpGrp ).isNotNull();

        GrpGrpPK grpGrpPK = new GrpGrpPK("NOGROUP", "WGS20");

        GrpGrp grpGrp2 = new GrpGrp( grpGrpPK);
        assertThat( grpGrp2 ).isNotNull();
    }

    @Test
    public void gentest() {
        String strValue = this.randomString( 3 );

        System.out.println( strValue );
    }

    private String randomString( int len ){
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }

    @Test
    public void loggerTest() {
        Instant now = Instant.now();
        Timestamp currentTimeStamp = Timestamp.from(now);

        ErrorDetail errorDetail = new ErrorDetail();

        errorDetail.setTimeStamp( currentTimeStamp.getTime() );
        errorDetail.setStatus( 404 );
        errorDetail.setTitle( "Bad news Basil" );
        errorDetail.setDetail( "a Mess" );
        errorDetail.setDeveloperMessage( "in java.." );

        log.error( errorDetail.toString() );

    }
}