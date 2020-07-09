package com.example.demo;

import com.example.demo.soapclient.UserClient;
import com.example.demo.wsdl.classes.GetUserResponseType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner lookup(UserClient userClient) {
		return args -> {
			String snils = "28752377117";

			GetUserResponseType response = userClient.getUser(snils);
			System.err.println(response.getLogin().getFirstname());
		};
	}


}
