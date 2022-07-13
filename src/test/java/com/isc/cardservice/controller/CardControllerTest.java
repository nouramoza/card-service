package com.isc.cardservice.controller;

import com.isc.cardservice.enums.CardTypeEnum;
import com.isc.cardservice.util.ConstantsUtil;
import com.isc.cardservice.web.dto.AddCardDto;
import com.isc.cardservice.web.dto.SearchCardDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;
import com.isc.cardservice.web.error.ErrorConstants;
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
import org.springframework.transaction.annotation.Transactional;

import java.net.URI;

import static com.isc.cardservice.controller.BasicInfoControllerTest.mapToJson;
import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CardControllerTest {
    @Autowired
    MockMvc mockMvc;

    private static final URI ADD_CARD_URI = URI.create("/api/v1/card-service/addCard");
    private static final URI GET_CARD_URI = URI.create("/api/v1/card-service/getCard");

    @Test
    public void addCard() throws Exception {
        AddCardDto addCardDto = new AddCardDto("9802736251",
                "4938372617", "716671",
                "Hamedan",
                CardTypeEnum.CASH);

        String addCardStr = mapToJson(addCardDto);
        RequestBuilder req = post(ADD_CARD_URI)
                .contentType(MediaType.APPLICATION_JSON)
                .content(addCardStr);

        MvcResult mvcResult = this.mockMvc.perform(req)
                .andExpect(content().string(containsString(ConstantsUtil.ResponseMessage.CARD_ADDED_SUCCESSFULLY)))
                .andExpect(content().string(containsString("\"status\":".concat(String.valueOf(GenericRestResponse.STATUS.SUCCESS)))))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn();
    }

    @Test
    @Transactional
    public void addDuplicateCard() throws Exception {
        AddCardDto addCardDto = new AddCardDto("2064865391",
                "3620198454", "121111",
                "Markazi",
                CardTypeEnum.CREDIT);

        String addCardStr = mapToJson(addCardDto);
        RequestBuilder req = post(ADD_CARD_URI)
                .contentType(MediaType.APPLICATION_JSON)
                .content(addCardStr);

        MvcResult mvcResult = this.mockMvc.perform(req)
                .andExpect(status().isOk())
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.DUPLICATE_CARD_MSG)))
				.andExpect(content().string(containsString("\"status\":".concat(String.valueOf(GenericRestResponse.STATUS.FAILURE)))))
                .andDo(print())
                .andReturn();
    }

    @Test
    public void searchCardNotFound() throws Exception {

        SearchCardDto searchCardDto = new SearchCardDto("2064865391",
                "6280231451904303", CardTypeEnum.CASH, "121111");

        String searchCardStr = mapToJson(searchCardDto);
        RequestBuilder req = post(GET_CARD_URI)
                .contentType(MediaType.APPLICATION_JSON)
                .content(searchCardStr);

        MvcResult mvcResult = this.mockMvc.perform(req)
                .andExpect(status().isOk())
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.NOT_FOUND_KEY)))
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.NOT_FOUND_MSG)))
				.andExpect(content().string(containsString("\"status\":".concat(String.valueOf(GenericRestResponse.STATUS.FAILURE)))))
                .andDo(print())
                .andReturn();
    }

    @Test
    public void searchCardNotActive() throws Exception {
        SearchCardDto searchCardDto = new SearchCardDto("2064865391",
                "6280231451904123", CardTypeEnum.CASH, "121111");

        String searchCardStr = mapToJson(searchCardDto);
        RequestBuilder req = post(GET_CARD_URI)
                .contentType(MediaType.APPLICATION_JSON)
                .content(searchCardStr);

        MvcResult mvcResult = this.mockMvc.perform(req)
                .andExpect(status().isOk())
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.NOT_ACTIVE_KEY)))
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.NOT_ACTIVE_MSG)))
				.andExpect(content().string(containsString("\"status\":".concat(String.valueOf(GenericRestResponse.STATUS.FAILURE)))))
                .andDo(print())
                .andReturn();
    }

    @Test
    public void searchCardExpired() throws Exception {
        SearchCardDto searchCardDto = new SearchCardDto("2064865391",
                "6280231487654567", CardTypeEnum.CASH, "121111");

        String searchCardStr = mapToJson(searchCardDto);
        RequestBuilder req = post(GET_CARD_URI)
                .contentType(MediaType.APPLICATION_JSON)
                .content(searchCardStr);

        MvcResult mvcResult = this.mockMvc.perform(req)
                .andExpect(status().isOk())
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.EXPIRED_KEY)))
				.andExpect(content().string(containsString(ErrorConstants.CardMessage.EXPIRED_MSG)))
				.andExpect(content().string(containsString("\"status\":".concat(String.valueOf(GenericRestResponse.STATUS.FAILURE)))))
                .andDo(print())
                .andReturn();
    }
}
