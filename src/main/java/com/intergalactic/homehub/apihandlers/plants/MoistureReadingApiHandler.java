package com.intergalactic.homehub.apihandlers.plants;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/mReading", produces = MediaType.APPLICATION_JSON_VALUE)
public class MoistureReadingApiHandler
{

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void enterMoistureReading(){

	}

	@GetMapping(path = "/getAll")
	public void getAllMoistureReadings(){

	}

	@GetMapping(path = "/getForDate")
	public void getMoistureReadingForDate(){

	}

	@GetMapping(path = "/getForPlant")
	public void getMoistureReadingForPlant(){

	}

	@GetMapping(path = "/getForPlantAndDate")
	public void getMoistureReadingForPlantOnDate(){

	}
}
