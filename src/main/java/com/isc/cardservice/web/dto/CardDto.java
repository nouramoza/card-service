package com.isc.cardservice.web.dto;

import com.isc.cardservice.enums.CardTypeEnum;
import lombok.*;
import org.springframework.lang.NonNull;

import java.util.Date;

@Data
public class CardDto {
    private Long id;

    private AccountDto accountDto;

    @NonNull
    private String cardNumber;

    @NonNull
    private CardTypeEnum cardType;

    @NonNull
    private String issuerName;

    @NonNull
    private String issuerCode;

    @NonNull
    private Date expireDate;

    private Boolean isActive;

}
