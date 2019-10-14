package com.intergalactic.homehub.apihandlers.plants;

import com.intergalactic.homehub.model.plants.MoistureReading;
import com.intergalactic.homehub.service.MoistureReadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/mReading", produces = MediaType.APPLICATION_JSON_VALUE)
public class MoistureReadingApiHandler
{
	@Autowired
	private MoistureReadingService moistureReadingService;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String enterMoistureReading(MoistureReading moistureReading){
		this.moistureReadingService.enterMoistureReading(moistureReading);
		return "Moisture reading entered";
	}

	@GetMapping(path = "/getAll")
	public List<MoistureReading> getAllMoistureReadings(){
		return this.moistureReadingService.getAllMoistureReadings();
	}

	@GetMapping(path = "/getForDate", params = "date")
	public void getMoistureReadingForDate(@RequestParam("id") String date){

	}

	@GetMapping(path = "/getForPlant/{id}")
	public void getMoistureReadingForPlant(@PathVariable Long id){

	}

	@GetMapping(path = "/getForPlantAndDate", params = {"id", "date"})
	public void getMoistureReadingForPlantOnDate(@RequestParam Long id, @RequestParam String date){

	}
}
