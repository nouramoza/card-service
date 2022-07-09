package com.isc.cardservice.service.serviceImpl;

import com.isc.cardservice.entity.AccountEntity;
import com.isc.cardservice.entity.CardEntity;
import com.isc.cardservice.repository.AccountRepository;
import com.isc.cardservice.repository.CardRepository;
import com.isc.cardservice.service.CardService;
import com.isc.cardservice.web.dto.AccountDto;
import com.isc.cardservice.web.dto.CardDto;
import com.isc.cardservice.web.dto.response.BankRestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository cardRepository;

    @Autowired
    private AccountRepository accountRepository;

//    @Override
//    public BankRestResponse addCard(CardDto cardDto) {
//
//        BankRestResponse restResponse;
//
//        AccountEntity accountEntity = accountRepository.findByAccountNumber(cardDto.getAccountDto().getAccountNumber());
//
//        CardEntity cardEntity = new CardEntity(null, accountEntity, cardDto.getCardNumber(),
//                cardDto.getCvv2(), cardDto.getExpireDate(),
//                cardDto.getPin(), 0, cardDto.getIsActive());
//
//        cardRepository.saveAndFlush(cardEntity);
//        return new BankRestResponse(BankRestResponse.STATUS.SUCCESS, cardEntity.getId().toString());
//    }

//    @Override
//    public BankRestResponse addAccount(AccountDto accountDto) {
//        BankRestResponse restResponse;
//
//        AccountEntity accountEntity = new AccountEntity(null, accountDto.getAccountNumber(),
//                accountDto.getPersonId(), accountDto.getBalance(), accountDto.getIsActive());
//
//        accountRepository.saveAndFlush(accountEntity);
//        return new BankRestResponse(BankRestResponse.STATUS.SUCCESS, accountEntity.getId().toString());
//    }
}
