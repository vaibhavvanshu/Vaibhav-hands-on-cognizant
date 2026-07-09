package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller for Account Microservice.
 */
@RestController
public class AccountController {

    /**
     * Returns dummy account details.
     */
    @GetMapping("/accounts/{number}")
    public Account getAccount(@PathVariable String number) {

        return new Account(
                number,
                "Savings",
                234343
        );
    }
}