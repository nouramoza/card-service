package com.isc.cardservice.web.dto;

import com.sun.istack.internal.NotNull;
import lombok.*;

import java.util.List;


@Data public class AccountDto {
    private Long id;

    @NonNull
    private String accountNumber;

    @NotNull
    private Long personId;

    @NotNull
    private Long balance;

    private Boolean isActive;

    private List<CardDto> cardDtoList;

}
