package com.isc.cardservice.enums;

public enum CardTypeEnum {
    CASH(1),
    CREDIT(2),
    GIFT(3),
    LOAN(4);

    private int value;

    CardTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
