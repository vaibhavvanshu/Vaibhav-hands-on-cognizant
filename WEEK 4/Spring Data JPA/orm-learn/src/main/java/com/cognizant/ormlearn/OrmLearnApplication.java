package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

/**
 * Main class for Spring Boot application.
 */
@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER =
			LoggerFactory.getLogger(OrmLearnApplication.class);

	private static CountryService countryService;

	public static void main(String[] args) {

		// Load Spring Boot Application Context
		ApplicationContext context =
				SpringApplication.run(OrmLearnApplication.class, args);

		LOGGER.info("Inside main");

		// Get CountryService Bean
		countryService = context.getBean(CountryService.class);

		// Test method
		testGetAllCountries();
	}

	/**
	 * Method to retrieve and display all countries.
	 */
	private static void testGetAllCountries() {
		LOGGER.info("Start");
		List<Country> countries = countryService.getAllCountries();
		LOGGER.debug("Countries = {}", countries);
		LOGGER.info("End");
	}
}