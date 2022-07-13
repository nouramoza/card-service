package com.isc.cardservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.isc.cardservice.web.dto.PersonDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import java.net.URI;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BasicInfoControllerTest {

    @Autowired
    MockMvc mockMvc;

    private static final URI ADD_PERSON_URI = URI.create("/api/v1/basic-info/addPerson");

    @Test
    public void addAccount() throws Exception {
        PersonDto personDto = new PersonDto("Noura", "Mozafari",
                "2064565391", "tehran, majidie",
                "09113149630");
        String personStr = mapToJson(personDto);
        RequestBuilder req = post(ADD_PERSON_URI)
                .contentType(MediaType.APPLICATION_JSON)
                .content(personStr);

        MvcResult mvcResult = this.mockMvc.perform(req)
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
    }

    protected static String mapToJson(Object obj) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(obj);
    }

}
