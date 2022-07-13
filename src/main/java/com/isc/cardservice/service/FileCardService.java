package com.isc.cardservice.service;

import com.isc.cardservice.web.dto.SearchCardDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;

public interface FileCardService {
    GenericRestResponse searchInFile(String directory, SearchCardDto searchCardDto);
}
