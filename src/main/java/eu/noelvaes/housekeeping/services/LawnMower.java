package eu.noelvaes.housekeeping.services;

import org.springframework.stereotype.Component;

@Component
public class LawnMower implements GardeningTool {
	public void doGardenJob() {
		System.out.println("Mowing the lawn");
	}
}
