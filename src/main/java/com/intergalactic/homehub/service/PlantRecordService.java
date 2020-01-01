package com.intergalactic.homehub.service;

import com.intergalactic.homehub.model.plants.PlantRecord;
import com.intergalactic.homehub.repository.plants.PlantRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class PlantRecordService
{
	@Autowired
	private PlantRecordRepository plantRecordRepository;

	public void createRecord(PlantRecord plantRecord){
		this.savePlant(plantRecord);
	}

	public void updatePlant(PlantRecord plantRecord){
		this.savePlant(plantRecord);
	}

	private void savePlant(PlantRecord plantRecord){
		this.plantRecordRepository.save(plantRecord);
	}

	public void deletePlant(Long id){
		this.plantRecordRepository.deleteById(id);
	}

	public List<PlantRecord> getAllPlantsList(){
		return StreamSupport.stream(this.plantRecordRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public PlantRecord getPlantWithId(@PathVariable Long id){
		return this.plantRecordRepository.findById(id).get();
	}
}
