package com.isc.cardservice.service.serviceImpl;

import com.isc.cardservice.entity.AccountEntity;
import com.isc.cardservice.entity.PersonEntity;
import com.isc.cardservice.repository.AccountRepository;
import com.isc.cardservice.repository.PersonRepository;
import com.isc.cardservice.service.AccountService;
import com.isc.cardservice.web.dto.AccountDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private static final ModelMapper modelMapper = new ModelMapper();

    private AccountRepository accountRepository;

    private PersonRepository personRepository;

    @Override
    public GenericRestResponse getAllAccount() {
        List<AccountEntity> accountEntityList = accountRepository.findAll();
        return new GenericRestResponse(GenericRestResponse.STATUS.SUCCESS, String.valueOf(accountEntityList.size()), accountEntityList);
    }

    @Override
    public GenericRestResponse addAccounts(List<AccountDto> accountDtoList) {
        List<AccountEntity> accountEntityList = new ArrayList<>();

        for (AccountDto accountDto : accountDtoList) {
            PersonEntity personEntity = personRepository.findById(accountDto.getPersonId()).get();
            AccountEntity accountEntity = modelMapper.map(accountDto, AccountEntity.class);
            accountEntity.setPersonEntity(personEntity);
            accountEntity.setIsActive(true);
            accountEntityList.add(accountEntity);
        }
        accountRepository.saveAll(accountEntityList);

        return new GenericRestResponse(GenericRestResponse.STATUS.SUCCESS, String.valueOf(accountEntityList.size()));
    }
}
