package com.anthem.member.ngmemberboot.service;

import com.anthem.member.ngmemberboot.model.JidJobIdPageSort;

import java.util.List;

public interface ClientActiveService {

    List<JidJobIdPageSort> findAllActiveClientsWithSystemSource( int page, String systemCode );
}
