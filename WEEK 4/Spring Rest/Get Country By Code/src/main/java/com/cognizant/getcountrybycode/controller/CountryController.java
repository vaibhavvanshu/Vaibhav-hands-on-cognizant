package com.cognizant.getcountrybycode.controller;

import com.cognizant.getcountrybycode.Country;
import com.cognizant.getcountrybycode.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * REST Controller
 */
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    /**
     * Returns country based on country code.
     */
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }
}