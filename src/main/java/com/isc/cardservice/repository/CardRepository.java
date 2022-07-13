package com.isc.cardservice.repository;

import com.isc.cardservice.entity.CardEntity;
import com.isc.cardservice.enums.CardTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

    @Query("select c from CardEntity c where c.cardNumber =:cardNumber and c.issuerCode =:issuerCode and c.cardType =:cardType and c.accountEntity.personEntity.nationalCode = :nationalCode")
    CardEntity searchForPersonCardType(@Param("cardNumber") String cardNumber,
                                       @Param("issuerCode")String issuerCode,
                                       @Param("cardType")CardTypeEnum cardType,
                                       @Param("nationalCode")String nationalCode);
}
