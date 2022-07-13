package com.isc.cardservice.service;

import com.isc.cardservice.web.dto.AccountDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;

import java.util.List;

public interface AccountService {

    GenericRestResponse getAllAccount();

    GenericRestResponse addAccounts(List<AccountDto> accountDtoList);

}
