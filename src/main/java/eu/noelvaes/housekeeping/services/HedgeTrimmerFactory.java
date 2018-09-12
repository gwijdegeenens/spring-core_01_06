package eu.noelvaes.housekeeping.services;
import java.time.LocalTime;
import javax.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class HedgeTrimmerFactory {
	@Bean
	@Primary
	public GardeningTool getHedgeTrimmer() {
		int hour = LocalTime.now().getHour();
		if (hour > 8 || hour < 18) {
			return () -> System.out.println("Trimming electric (noisily)");
		} else {
			return () -> System.out.println("Trimming manual (silently)");
		}
	}
	
	@PostConstruct
	public void init() {
		System.out.println("HedgeTrimmerFactory intializing.");
	}

   @PreDestroy
   public void destroy() {
   	System.out.println("HedgeTrimmerFactory closing.");
   }

}
