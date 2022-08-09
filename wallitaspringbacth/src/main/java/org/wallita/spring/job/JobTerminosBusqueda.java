package org.wallita.spring.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.wallita.spring.step.StepTerminosBusqueda;

@Configuration
@EnableBatchProcessing
@EnableScheduling
@Import(StepTerminosBusqueda.class)
public class JobTerminosBusqueda {
	
	@Autowired
	private JobBuilderFactory jbf;


    @Bean
    Job terminosBusqueda(@Qualifier("terminos busqueda") Step terminosBusqueda) {
        return jbf.get("terminos_busqueda")
                .start(terminosBusqueda)
                .incrementer(new RunIdIncrementer())
                .build();
    }

}
