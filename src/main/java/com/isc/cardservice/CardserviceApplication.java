package com.isc.cardservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CardserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardserviceApplication.class, args);
	}

}
