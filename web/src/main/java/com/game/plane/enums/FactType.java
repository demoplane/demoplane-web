package com.game.plane.enums;

public enum FactType {
    PROGRESSIVE("0"),
    CONSERVATIVE("1");

    private String code;

    FactType(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }
}
