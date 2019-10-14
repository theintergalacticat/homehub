package com.intergalactic.homehub.service;

import com.intergalactic.homehub.model.plants.WaterLog;
import com.intergalactic.homehub.repository.plants.WaterLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Component
public class WaterLogService
{
	@Autowired
	private WaterLogRepository waterLogRepository;

	public void logWaterForPlant(WaterLog waterLog){
		this.waterLogRepository.save(waterLog);
	}

	public void getWaterLogForDate(String date){

	}

	public void getWaterLogForPlant(Long id){

	}

	public List<WaterLog> getCompleteWaterLog(){
		return StreamSupport.stream(this.waterLogRepository.findAll().spliterator(), false).collect(Collectors.toList());
	}

	public void getWaterLogForPlantOnDate(Long id, String date){

	}
}
