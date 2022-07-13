package com.isc.cardservice.web.controller;

import com.isc.cardservice.service.PersonService;
import com.isc.cardservice.web.dto.PersonDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/basic-info")
@AllArgsConstructor
public class BasicInfoController {
    private PersonService personService;

    @RequestMapping(value = "/addPerson", method = RequestMethod.POST)
    public GenericRestResponse addPerson(@RequestBody PersonDto personDto) {
        return personService.addPerson(personDto);
    }

    @RequestMapping(value = "/addPeople", method = RequestMethod.POST)
    public GenericRestResponse addPeople(@RequestBody List<PersonDto> personDtoList) {
        return personService.addPeople(personDtoList);
    }

    @RequestMapping(value = "/getAllPeople", method = RequestMethod.GET)
    public GenericRestResponse getAllPeople() {
        return personService.getAllPeople();
    }
}
