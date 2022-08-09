package org.wallita.spring.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wallita.entity.Termino;
import org.wallita.model.search.SearchRoot;
import org.wallita.spring.reader.H2Reader;
import org.wallita.spring.step.listener.TerminosBusquedaListener;
import org.wallita.spring.writer.Writter;


@Configuration
public class StepTerminosBusqueda {

	
	@Autowired
	private StepBuilderFactory sbf;
	
	@Autowired
	private TerminosBusquedaListener listener;
	
	@Autowired
	private H2Reader reader;
	
	@Autowired
	private Writter wr;
	
	@Bean(name ="terminos busqueda")
	Step stepTerminosBusqueda() {
		return sbf.get("step terminos busqueda")
				.<Termino, Termino>chunk(3)
				.reader(reader.getTerminos())
			//	.processor(null)
				.writer(wr.writter1())
				.listener(listener)
				.allowStartIfComplete(true)
				.build();
	}
	
}
