package com.intergalactic.homehub.service;

import com.intergalactic.homehub.model.plants.MoistureReading;
import com.intergalactic.homehub.repository.plants.MoistureReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class MoistureReadingService
{
	@Autowired
	private MoistureReadingRepository moistureReadingRepository;

	public MoistureReading enterMoistureReading(MoistureReading moistureReading){
		return this.moistureReadingRepository.save(moistureReading);
	}

	public List<MoistureReading> getAllMoistureReadings(){
		return StreamSupport.stream(this.moistureReadingRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public void getMoistureReadingForDate(String date){

	}

	public void getMoistureReadingForPlant(Long id){

	}

	public void getMoistureReadingForPlantOnDate(Long id, String date){

	}
}
