package com.isc.cardservice.service;

import com.isc.cardservice.web.dto.PersonDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;

import java.util.List;

public interface PersonService {

    GenericRestResponse getAllPeople();

    GenericRestResponse addPerson(PersonDto personDto);

    GenericRestResponse addPeople(List<PersonDto> personDtoList);

}
