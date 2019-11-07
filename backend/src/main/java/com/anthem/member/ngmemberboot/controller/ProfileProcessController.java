package com.anthem.member.ngmemberboot.controller;

import com.anthem.member.ngmemberboot.dto.CreateProfileDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/backend/profile",
        produces = "application/json")
public class ProfileProcessController {

    @PostMapping(value = "/addProfile")
    public ResponseEntity<?> addProfile( @RequestBody CreateProfileDTO profileDTO ) {
        log.debug( "**********************  ProfileProcessController::addProfile  **********************" );
        log.debug( profileDTO.toString() );
        log.debug( "**********************  ProfileProcessController::addProfile  **********************" );
        return null;
    }
}
