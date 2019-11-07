package com.anthem.member.ngmemberboot.helppers;

import com.anthem.member.ngmemberboot.constants.Constants;
import com.anthem.member.ngmemberboot.dto.ClientIdSourceSystemDTO;
import com.anthem.member.ngmemberboot.dto.UserInfo;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.JidJobidPK;

import java.sql.Timestamp;
import java.time.Instant;

public class JidJobIdHelper {

    private ClientIdSourceSystemDTO dto;

    public JidJobIdHelper( ClientIdSourceSystemDTO clientIdSourceSystemDTO ) {
        this.dto = clientIdSourceSystemDTO;
    }

    public JidJobid createJidJobId() {
/*
        ClientIdSourceSystemDTO dto = ClientIdSourceSystemDTO
                .builder()
                .userInfo( UserInfo.builder().usedId( "AF88034" ).build() )
                .jobId( "JOB27" )
                .sourceSystem( "WGS20" )
                .build();
*/

        Instant now = Instant.now();

        Timestamp jidEfctvDt = Timestamp.from( now );

        return new JidJobid.JidJobIdBuilder()
                .id( new JidJobidPK( dto.getJobId(), dto.getSourceSystem(), jidEfctvDt ) )
                .jidTrmntnDt( null )
                .jidJobidStatCd( Constants.ACTIVE_JOBID_STATUS )
                .jidOwnerId( dto.getUserId() )
                .modifyUsusId( dto.getUserId() )
                .modifyDtTm( jidEfctvDt )
                .jidDescTxt( dto.getDescription() )
                .build();
    }
}
