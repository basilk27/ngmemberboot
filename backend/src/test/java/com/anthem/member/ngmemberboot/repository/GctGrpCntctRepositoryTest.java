package com.anthem.member.ngmemberboot.repository;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.model.EpfGrpEetProflPK;
import com.anthem.member.ngmemberboot.model.GctGrpCntct;
import com.anthem.member.ngmemberboot.model.GctGrpCntctPK;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.jdbc.Sql;

import java.sql.Timestamp;
import java.time.Instant;

import static org.junit.Assert.*;

public class GctGrpCntctRepositoryTest {

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
    @Sql( { "/sqlscripts/gctgrpcntctschema.sql" } )
    public void GctGrpCntctBuilder() {
        //given
        /* bmk
        GctGrpCntct gctGrpCntct = new GctGrpCntct.GctGrpCntctBuilder()
                .id( new GctGrpCntctPK("AMK", "NOGROUP", "NOSUBGROUP",
                        Constants.WGS20_CMS_SYSTEM_CODE, timestampNow, (short)0, "EETN" ))
                .epfGrpEetProfl( new EpfGrpEetProflPK("AMK", "NOGROUP",
                                                        Constants.WGS20_CMS_SYSTEM_CODE, timestampNow))

        */
        //when

        //then
    }
}