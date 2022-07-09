package com.isc.cardservice.enums;

public enum AccountType {
    LONG_DEPOSIT(1),
    SHORT_DEPOSIT(2),
    CURRENT(3),
    GHARZ(4);

    private int value;

    AccountType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
