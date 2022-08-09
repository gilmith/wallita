package org.wallita.spring.writer;

import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.LineAggregator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.wallita.entity.Termino;
import org.wallita.model.search.SearchRoot;

@Component
public class Writter {

	@Bean
	public FlatFileItemWriter<Termino> writter1(){
		FlatFileItemWriter<Termino> fiw = new FlatFileItemWriter<>();
		fiw.setLineAggregator(new LineAggregator<Termino>() {
			
			@Override
			public String aggregate(Termino item) {
				System.out.println(item.getTermino());
				return item.getTermino();
			}
		});
		return fiw;
	}
	
	
}
