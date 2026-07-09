package com.cognizant.getcountrybycode.service;

import com.cognizant.getcountrybycode.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class for Country operations.
 */
@Service
public class CountryService {

    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countryList = new ArrayList<>();

        countryList.add(context.getBean("country1", Country.class));
        countryList.add(context.getBean("country2", Country.class));
        countryList.add(context.getBean("country3", Country.class));
        countryList.add(context.getBean("country4", Country.class));

        for (Country country : countryList) {

            if (country.getCode().equalsIgnoreCase(code)) {
                return country;
            }

        }

        return null;
    }
}