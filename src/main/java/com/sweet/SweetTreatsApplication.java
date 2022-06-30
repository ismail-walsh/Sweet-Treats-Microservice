package com.sweet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class SweetTreatsApplication {
	public static void main(String[] args) { SpringApplication.run(SweetTreatsApplication.class, args);}
}