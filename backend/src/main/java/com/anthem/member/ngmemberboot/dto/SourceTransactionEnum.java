package com.anthem.member.ngmemberboot.dto;

public enum SourceTransactionEnum {

    D950("Diamond 950"), FCETS("Facts System"), M204("M204"),
    QCARE("QCARE System"), STAR("STAR System"),
    WGS13("WGS 1.3 System"), WGS20("WGS 2.0 System");

    private String description;

    SourceTransactionEnum( String description ) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
