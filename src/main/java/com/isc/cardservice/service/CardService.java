package com.isc.cardservice.service;

import com.isc.cardservice.web.dto.AddCardDto;
import com.isc.cardservice.web.dto.SearchCardDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;

public interface CardService {
    GenericRestResponse addCard(AddCardDto addCardDto);

    GenericRestResponse getCard(SearchCardDto searchCardDto);

}
