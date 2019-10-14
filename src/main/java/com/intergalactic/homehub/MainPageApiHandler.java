package com.intergalactic.homehub;

import com.intergalactic.homehub.apihandlers.plants.MoistureReadingApiHandler;
import com.intergalactic.homehub.apihandlers.plants.PlantsApiHandler;
import com.intergalactic.homehub.apihandlers.plants.WaterLogApiHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainPageApiHandler
{
	@RequestMapping("/")
	public String selectionScreen()
	{
		return "Plants, Workout, Reminders, Bills";
	}

	public static void main(String[] args)
	{
		SpringApplication.run(new Class[] { MainPageApiHandler.class,  PlantsApiHandler.class, MoistureReadingApiHandler.class, WaterLogApiHandler.class }, args);
	}
}
