package com.bank.mspasive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class MsPasiveApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsPasiveApplication.class, args);
	}

}
