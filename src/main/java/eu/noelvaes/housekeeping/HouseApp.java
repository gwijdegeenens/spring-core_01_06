package eu.noelvaes.housekeeping;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.noelvaes.housekeeping.services.DomesticService;

public class HouseApp {
   public static void main(String[] args) {
      try (
         ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(
            AppConfig.class)) {
         System.out.println("Container initialized");
         DomesticService service = ctx.getBean("domesticService",
            DomesticService.class);
         service.runHousehold();
      }
   }
}
