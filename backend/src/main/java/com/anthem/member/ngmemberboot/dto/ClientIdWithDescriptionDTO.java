package com.anthem.member.ngmemberboot.dto;

import com.anthem.member.ngmemberboot.model.JidJobidPK;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ClientIdWithDescriptionDTO {

    private final JidJobidPK id;

    private final String jidDescTxt;
}
