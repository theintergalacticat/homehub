package com.intergalactic.homehub.apihandlers.plants;

import com.intergalactic.homehub.repository.plants.PlantsWateringRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/plants", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlantsApiHandler
{
	@Autowired
	private PlantsWateringRepository plantsWateringRepository;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPlant(){

	}

	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePlant(){

	}

	@PostMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deletePlant(){

	}

	@GetMapping(path = "/getAll")
	public void getAllPlantsList(){

	}
}
