package org.wallita.spring.step.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class TerminosBusquedaListener implements StepExecutionListener  {

	@Override
	public void beforeStep(StepExecution stepExecution) {
		return;
		
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		// TODO Auto-generated method stub
		return null;
	}

}
