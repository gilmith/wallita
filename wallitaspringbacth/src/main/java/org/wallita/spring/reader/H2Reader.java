package org.wallita.spring.reader;

import javax.persistence.EntityManagerFactory;

import org.springframework.batch.item.database.JpaCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.wallita.entity.Termino;

@Component
public class H2Reader {

	@Autowired
	EntityManagerFactory em;
	
	@Bean
	public JpaCursorItemReader<Termino> getTerminos(){
		JpaCursorItemReader<Termino> jpaCursorItemReader = 
				new JpaCursorItemReader<Termino>();		
		jpaCursorItemReader.setEntityManagerFactory(em);		
		jpaCursorItemReader.setQueryString("from Termino");	
		return jpaCursorItemReader;
	}
	
}
