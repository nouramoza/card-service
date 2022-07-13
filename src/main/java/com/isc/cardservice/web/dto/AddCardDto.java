package com.isc.cardservice.web.dto;

import com.isc.cardservice.enums.CardTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCardDto {

    @NonNull
    @Size(min = 10, max = 10)
    private String nationalCode;

    @NonNull
    @Size(min = 10, max = 10)
    private String accountNumber;

    @NonNull
    @Size(min = 6, max = 6)
    private String issuerCode;

    @NonNull
    private String issuerName;

    @NonNull
    private CardTypeEnum cardType;
}
