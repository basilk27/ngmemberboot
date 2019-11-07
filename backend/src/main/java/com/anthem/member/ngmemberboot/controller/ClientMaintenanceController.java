package com.anthem.member.ngmemberboot.controller;

import com.anthem.member.ngmemberboot.dto.ClientIdSourceSystemDTO;
import com.anthem.member.ngmemberboot.dto.SystemSource;
import com.anthem.member.ngmemberboot.model.JidJobid;
import com.anthem.member.ngmemberboot.model.TypCdVw;
import com.anthem.member.ngmemberboot.service.ClientMaintService;
import com.anthem.member.ngmemberboot.service.ClientMaintServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/membership-server/v1",
            produces = "application/json")
public class ClientMaintenanceController {

    private ClientMaintServiceImpl clientMaintService;

    @Autowired
    public ClientMaintenanceController( ClientMaintServiceImpl clientMaintService ) {
        this.clientMaintService = clientMaintService;
    }

    @GetMapping(value = "/typcdvws")
    public ResponseEntity<List<SystemSource>> findSystemSources() {
        List<SystemSource> systemSourceList = clientMaintService.findSystemSources();

        if ( ( null == systemSourceList ) || ( systemSourceList.isEmpty() ) ) {
            return new ResponseEntity<>( ( List<SystemSource> ) null, HttpStatus.NOT_FOUND );
        }
        else return new ResponseEntity<>( systemSourceList, HttpStatus.OK  );
    }

    @PostMapping(value = "/jobids", consumes = "application/json")
    public ResponseEntity<JidJobid> createEmployerJob( @RequestBody ClientIdSourceSystemDTO clientMaintDTO ) {
        JidJobid jidJobid = clientMaintService.createEmployerJobId( clientMaintDTO );

        return new ResponseEntity<>( jidJobid, HttpStatus.CREATED );
    }

}
