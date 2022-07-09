package com.isc.cardservice.service;

import com.isc.cardservice.web.dto.PersonDto;
import com.isc.cardservice.web.dto.response.BankRestResponse;

public interface PersonService {
    BankRestResponse addPerson(PersonDto personDto);
}
