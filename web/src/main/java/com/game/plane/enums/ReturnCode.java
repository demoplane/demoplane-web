package com.game.plane.enums;

public enum ReturnCode {
    SUCCESS("0000", "Success"),
    DB_FAIL("1000", "Db manipulation fail"),
    UNKNOWN("9999", "Unknown error occured");

    private String returnCode;
    private String returnMessage;

    ReturnCode(String returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }

    public String getReturnCode() {
        return this.returnCode;
    }

    public String getReturnMessage() {
        return this.returnMessage;
    }
}
