package com.bext.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bext.SpringBootWebApplication;
import com.bext.repository.IPersonaRepo;

@Service
public class PersonaServiceImpl implements IPersonaService {
    private static Logger LOG = LoggerFactory.getLogger(SpringBootWebApplication.class);
	
    @Autowired
    @Qualifier("PersonaRepo2")
    private IPersonaRepo personaRepo;
    
	@Override
	public void alta(String nombre) {
	  	LOG.info("Service Alta Persona: " + nombre);
	  	
		personaRepo.persistir(nombre);
	}

}
