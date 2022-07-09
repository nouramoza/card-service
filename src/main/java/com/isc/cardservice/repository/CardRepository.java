package com.isc.cardservice.repository;

import com.isc.cardservice.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

    public CardEntity findByCardNumber(String cardNumber);

}
