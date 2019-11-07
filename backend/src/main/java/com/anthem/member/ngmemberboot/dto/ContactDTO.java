package com.anthem.member.ngmemberboot.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ContactDTO {

    private final Integer id;
    private final String lastname;
    private final String firstname;
    private final String emailaddress;
    private final String phonenumber;
}
