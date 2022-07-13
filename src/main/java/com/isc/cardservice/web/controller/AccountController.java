package com.isc.cardservice.web.controller;

import com.isc.cardservice.service.AccountService;
import com.isc.cardservice.web.dto.AccountDto;
import com.isc.cardservice.web.dto.response.GenericRestResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/account-service")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/getAllAccounts", method = RequestMethod.GET)
    public GenericRestResponse getAllAccounts() {
        return accountService.getAllAccount();
    }

    @RequestMapping(value = "/addAccounts", method = RequestMethod.POST)
    public GenericRestResponse addAccounts(@RequestBody List<AccountDto> accountDtoList) {
        return accountService.addAccounts(accountDtoList);

    }
}
