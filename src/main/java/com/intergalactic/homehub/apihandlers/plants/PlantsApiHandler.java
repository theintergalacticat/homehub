package com.intergalactic.homehub.apihandlers.plants;

import com.intergalactic.homehub.model.plants.PlantRecord;
import com.intergalactic.homehub.service.PlantRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/plants", produces = MediaType.APPLICATION_JSON_VALUE)
public class PlantsApiHandler
{
	@Autowired
	private PlantRecordService plantRecordService;

	@PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addPlant(@RequestBody PlantRecord plantRecord){
		this.plantRecordService.createRecord(plantRecord);
		return "Added new plant";
	}

	@PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updatePlant(){

	}

	@DeleteMapping(path = "/delete/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deletePlant(@PathVariable Long id){
		this.plantRecordService.deletePlant(id);
	}

	@GetMapping(path = "/getAll")
	public List<PlantRecord> getAllPlantsList(){
		return this.plantRecordService.getAllPlantsList();
	}

	@GetMapping(path = "/get/{id}")
	public PlantRecord getPlantWithId(@PathVariable Long id){
		return this.plantRecordService.getPlantWithId(id);
	}
}
