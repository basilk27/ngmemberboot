package com.anthem.member.ngmemberboot.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
public class JidJobidId implements Serializable {

    private final String jidJobId;

    private final String cmsSrcSysCd;

    private final Timestamp jidEfctvDt;
}
