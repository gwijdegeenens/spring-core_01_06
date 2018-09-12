package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Qualifier("wet")
@Order(3)
public class Sponge implements CleaningTool {
	public Sponge() {
		System.out.println("Sponge: constructor");
	}

   public void doCleanJob() {
      System.out.println("Splash splash");
   }
}
