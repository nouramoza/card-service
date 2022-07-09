package com.isc.cardservice.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ACCOUNT")
@Data
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ACCOUNT_NUMBER", nullable=false, unique = true)
    @NonNull
    private String accountNumber;

    @Column(name = "PERSON_ID", nullable=false)
    @NotNull
    private Long personId;

    @Column(name = "BALANCE", nullable=false)
    @NotNull
    private Long balance;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;
}
