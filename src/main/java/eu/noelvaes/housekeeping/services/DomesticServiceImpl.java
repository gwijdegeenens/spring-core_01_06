package eu.noelvaes.housekeeping.services;

import java.util.logging.Logger;

import javax.annotation.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component("domesticService")
public class DomesticServiceImpl implements DomesticService {
	private CleaningService cleaningService;
	private GardeningService gardeningService;
	@Autowired
	private Logger logger;
	
	@Autowired
	public void setCleaningService(@Qualifier("robot") CleaningService cleaningService) {
		this.cleaningService = cleaningService;
	}

	@Autowired
	public void setGardeningService(GardeningService gardeningService) {
		this.gardeningService = gardeningService;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("DomesticService preparing for work.");
	}

   @PreDestroy
   public void destroy() {
   	System.out.println("DomesticService cleaning up.");
   }

	public void runHousehold() {
	   logger.info("Running household");
		cleaningService.clean();
		gardeningService.garden();
	}	
}
