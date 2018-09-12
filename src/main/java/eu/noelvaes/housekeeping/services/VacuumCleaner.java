package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("electric")
@Order(2)
public class VacuumCleaner implements CleaningTool {
	public VacuumCleaner() {
		System.out.println("VacuumCleaner: constructor");
	}

   public void doCleanJob() {
      System.out.println("Zuuuuuuuuuuu");
   }
}
