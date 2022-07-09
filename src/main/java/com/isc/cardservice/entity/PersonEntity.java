package com.isc.cardservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "PERSON")
@Data
@AllArgsConstructor
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "FIRST_NAME", nullable=false)
    @NonNull
    private String firstName;

    @Column(name = "LAST_NAME", nullable=false)
    @NonNull
    private String lastName;

    @Column(name = "NATIONAL_CODE", nullable=false, unique = true)
    @NonNull
    private String nationalCode;

    @Column(name = "HOME_ADDRESS", nullable=false)
    @NonNull
    private String homeAddress;

    @Column(name = "PHONE_NUMBER", nullable=false)
    @NonNull
    private String phoneNumber;

}
