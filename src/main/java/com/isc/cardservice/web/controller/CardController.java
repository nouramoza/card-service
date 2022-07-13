package com.isc.cardservice.web.controller;

import com.isc.cardservice.service.CardService;
import com.isc.cardservice.web.dto.AddCardDto;
import com.isc.cardservice.web.dto.SearchCardDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/card-service")
@AllArgsConstructor
public class CardController {
    private final Logger logger = LoggerFactory.getLogger(CardController.class);

    private CardService cardService;

    @PostMapping(value = "/addCard")
    public GenericRestResponse addCard(@RequestBody AddCardDto addCardDto) {
        logger.debug("REST request to save Card : {}", addCardDto);
        logger.info("REST request to save Card : {}", addCardDto);
        return cardService.addCard(addCardDto);
    }

    @PostMapping(value = "/getCard")
    public GenericRestResponse getCard(@RequestBody SearchCardDto searchCardDto) {
        return cardService.getCard(searchCardDto);
    }

}
