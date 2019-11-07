package com.anthem.member.ngmemberboot.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.ArrayList;

@Data
@RequiredArgsConstructor
public class CreateProfileDTO {

    private String sourcesystem;
    private String clientid;
    private String userid;
    private String profilelevel;
    private Timestamp effectivedate;
    private Integer gracedays;
    private String termdateind;
    private Timestamp overridedate;
    private String addresschgflg;
    private String addressflipflg;
    private String pmppcpchangeind;
    private Integer pmppcpretrodaysnum;
    private String pickofpmgind;
    private String pickofpcpind;
    private String defaultofpmg;
    private String networkchgind;
    private String pickofnetworkind;
    private String defaultofnetwork;
    private String dependentonlycontact;
    private String dependentonlycontacts;
    private String otherdependentuse;
    private boolean careof;
    private boolean caretaker;
    private boolean cousinchkbox;
    private boolean domestiptrchild;
    private boolean domesitptr;
    private boolean fosterchild;
    private boolean father;
    private boolean grandchild;
    private boolean legalguardian;
    private boolean mother;
    private boolean niece;
    private boolean nephew;
    private boolean self;
    private boolean sibling;
    private boolean stepchild;
    private boolean unrelated;
    private boolean ward;
    private String middleinitialuse;
    private String createcob;
    private String createpreex;
    private String claimreportfieldrequired;
    private String claimcategoryrequired;
    private String departmentfieldrequired;
    private String clockemployeerequired;
    private String durationcapflag;
    private String subscribertermind;
    private String membertermind;
    private String countycodefromzipcode;
    private String pcpproviderfromepds2;
    private String processssbforcars;
    private String usehypheninnames;
    private String dateofhireindicator;
    private String memberfirstnamecheckindicator;
    private Timestamp providechangedate;
    private Timestamp networkchangedate;
    private String suppresspcperrorindicator;
    private String suppressduplicatecoverageerrorind;
    private String benefiteffectivedatebypass;
    private String actionincludeexcludeflag;
    private String reenroll;
    private String reinstate;
    private String groupincludeexcludeflag;
    private String availablegroups;
    private String groupstoincludeexclude;
    private String exchange;
    ArrayList<ContactDTO> contacts;

}
