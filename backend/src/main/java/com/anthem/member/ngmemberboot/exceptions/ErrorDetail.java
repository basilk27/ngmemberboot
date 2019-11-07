package com.anthem.member.ngmemberboot.exceptions;

import com.anthem.member.ngmemberboot.constants.Constants;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor(force = true)
public class ErrorDetail {

    private String  title;
    private int     status;
    private String  detail;
    private long    timeStamp;
    private String  path;
    private String  developerMessage;

    @Override
    public String toString() {
        LocalDateTime localDateTime = LocalDateTime.ofInstant( Instant.ofEpochMilli( this.timeStamp ), ZoneId.systemDefault() );
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern( Constants.DATE_TIME_FORMAT );
        StringBuilder stringBuilder = new StringBuilder( "\n\n****** ERROR in EET Restful back end.\n" )
                .append( "Title: \t\t" ).append( this.title ).append( "\n" )
                .append( "Status: \t" ).append( this.status ).append( "\n" )
                .append( "Detail: \t" ).append( this.detail ).append( "\n" )
                .append( "Time: \t\t" ).append( timeFormatter.format( localDateTime ) ).append( "\n" )
                .append( "Path: \t\t" ).append( this.path ).append( "\n" )
                .append( "Dev Msg: \t" ).append( this.developerMessage ).append( "\n\n" );

        return stringBuilder.toString();
    }
}
