package com.bext.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.bext.SpringBootWebApplication;

@Repository
public class PersonaRepoImpl implements IPersonaRepo {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootWebApplication.class);
	
	@Override
	public void persistir(String nombre) {
		LOG.info("Repository Persistiendo Persona: " + nombre);
	}

}
