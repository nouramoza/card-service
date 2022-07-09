package com.isc.cardservice.service.serviceImpl;

import com.isc.cardservice.entity.PersonEntity;
import com.isc.cardservice.repository.PersonRepository;
import com.isc.cardservice.service.PersonService;
import com.isc.cardservice.web.dto.PersonDto;
import com.isc.cardservice.web.dto.response.BankRestResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Override
    public BankRestResponse addPerson(PersonDto personDto) {
        PersonEntity personEntity = new PersonEntity(null,
                personDto.getFirstName(), personDto.getLastName(), personDto.getNationalCode(),
                personDto.getHomeAddress(), personDto.getPhoneNumber());
        personRepository.saveAndFlush(personEntity);
        return new BankRestResponse(BankRestResponse.STATUS.SUCCESS, personEntity.getId().toString());
    }
}
