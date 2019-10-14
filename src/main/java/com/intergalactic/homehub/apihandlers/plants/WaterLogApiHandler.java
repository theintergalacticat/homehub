package com.intergalactic.homehub.apihandlers.plants;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/waterlog", produces = MediaType.APPLICATION_JSON_VALUE)
public class WaterLogApiHandler
{
	@PostMapping(path = "/log", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void logWaterForPlant(){

	}

	@GetMapping(path = "/getForDate")
	public void getWaterLogForDate(){

	}

	@GetMapping(path = "/getForPlant")
	public void getWaterLogForPlant(){

	}

	@GetMapping(path = "/getAll")
	public void getCompleteWaterLog(){

	}

	@GetMapping(path = "/getForPlantAndDate")
	public void getWaterLogForPlantOnDate(){

	}
}
