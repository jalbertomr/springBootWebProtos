package com.bext.springBootWeb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication implements CommandLineRunner {
	
	private static Logger LOG = LoggerFactory.getLogger(SpringBootWebApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Logging en SpringBoot.");
		
	}

}
