package com.anthem.member.ngmemberboot.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TransformedTypCd {

    private final String ucfrFltrVal;

    public SystemSource getSystemSource() {
        SourceTransactionEnum sourceEnum = SourceTransactionEnum.valueOf( this.ucfrFltrVal );

        return new SystemSource( this.ucfrFltrVal, sourceEnum.getDescription() );
    }
}
