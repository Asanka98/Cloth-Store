package com.shop.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
@EnableScheduling
public class ClothesStoreApplication {

	public static void main(String[] args) {
		SpringApplication springApplication=new SpringApplication(ClothesStoreApplication.class);
	    System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
	    springApplication.run(args);
	}

}
