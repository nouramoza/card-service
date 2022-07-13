package com.isc.cardservice.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "ACCOUNT")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = "cardEntitySet")
public class AccountEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="PERSON_ID", referencedColumnName = "ID", nullable=false)
    private PersonEntity personEntity;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="accountEntity")
    private Set<CardEntity> cardEntitySet;

    @Column(name = "ACCOUNT_NUMBER", nullable=false, unique = true, length = 10)
    @Size(min = 10, max = 10)
    @NonNull
    private String accountNumber;

    @Column(name = "BALANCE", nullable=false, precision = 18)
    @NotNull
    private Long balance;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;
}
