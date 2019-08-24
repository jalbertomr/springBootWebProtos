package com.bext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bext.service.IPersonaService;
import com.bext.service.PersonaServiceImpl;

@SpringBootApplication
public class SpringBootWebApplication implements CommandLineRunner {
	private static Logger LOG = LoggerFactory.getLogger(SpringBootWebApplication.class);

	@Autowired
	private IPersonaService personaService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("Logging en SpringBoot.");

		personaService.alta("Juan Perez");
	}

}
