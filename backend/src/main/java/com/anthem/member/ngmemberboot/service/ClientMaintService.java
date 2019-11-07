package com.anthem.member.ngmemberboot.service;

import com.anthem.member.ngmemberboot.dto.ClientIdSourceSystemDTO;
import com.anthem.member.ngmemberboot.dto.SystemSource;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.TypCdVw;

import java.util.List;

public interface ClientMaintService {

    List<SystemSource> findSystemSources();

    JidJobid createEmployerJobId( ClientIdSourceSystemDTO clientIdSourceSystemDTO);

    List<JidJobid> findBySystemTypeAndJobId( String sourceSystem, String jobId );

    JidJobid viewEmployerJobId( ClientIdSourceSystemDTO clientIdSourceSystemDTO );

    JidJobid updateEmployerJobId( ClientIdSourceSystemDTO clientIdSourceSystemDTO );
}
