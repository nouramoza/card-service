package com.isc.cardservice.service.serviceImpl;

import com.isc.cardservice.entity.PersonEntity;
import com.isc.cardservice.repository.PersonRepository;
import com.isc.cardservice.service.PersonService;
import com.isc.cardservice.web.dto.PersonDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class PersonServiceImpl implements PersonService {
    private static final ModelMapper modelMapper = new ModelMapper();

    private PersonRepository personRepository;

    @Override
    public GenericRestResponse getAllPeople() {
        List<PersonEntity> personEntityList = personRepository.findAll();
        return new GenericRestResponse(GenericRestResponse.STATUS.SUCCESS, String.valueOf(personEntityList.size()), personEntityList);
    }

    @Override
    public GenericRestResponse addPerson(PersonDto personDto) {
        PersonEntity personEntity = modelMapper.map(personDto, PersonEntity.class);
        personRepository.saveAndFlush(personEntity);
        return new GenericRestResponse(GenericRestResponse.STATUS.SUCCESS, personEntity.getId().toString());
    }

    @Override
    public GenericRestResponse addPeople(List<PersonDto> personDtoList) {
        List<PersonEntity> personEntityList = new ArrayList<>();

        for (PersonDto personDto : personDtoList) {
            PersonEntity personEntity = modelMapper.map(personDto, PersonEntity.class);
            personEntityList.add(personEntity);
        }
        personRepository.saveAll(personEntityList);

        return new GenericRestResponse(GenericRestResponse.STATUS.SUCCESS, String.valueOf(personEntityList.size()),
                personEntityList);
    }
}
