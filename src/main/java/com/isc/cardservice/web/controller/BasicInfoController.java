package com.isc.cardservice.web.controller;

import com.isc.cardservice.service.CardService;
import com.isc.cardservice.service.PersonService;
import com.isc.cardservice.web.dto.AccountDto;
import com.isc.cardservice.web.dto.CardDto;
import com.isc.cardservice.web.dto.PersonDto;
import com.isc.cardservice.web.dto.response.BankRestResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/basic-info")
@AllArgsConstructor
public class BasicInfoController {
    private PersonService personService;


    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public BankRestResponse addPerson(@RequestBody PersonDto personDto) {
        return personService.addPerson(personDto);
    }


}
