package com.anthem.member.ngmemberboot.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@Builder
@ToString
public class ClientIdSourceSystemDTO {

    private final String jobId;
    private final String sourceSystem;
    private final String description;
    private final String userId;
}
