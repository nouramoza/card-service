package com.isc.cardservice.web.controller;

import com.isc.cardservice.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account-service")
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

//    @RequestMapping(value = "/requestManagement", method = RequestMethod.POST)
//    public BankRestResponse requestManagement(@RequestBody AccountRequestDto accountRequestDto) {
//        return accountService.requestManagement(accountRequestDto);
//
//    }
}
