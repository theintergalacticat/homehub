package com.intergalactic.homehub.apihandlers.plants;

import com.intergalactic.homehub.model.plants.WaterLog;
import com.intergalactic.homehub.service.WaterLogService;
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
@RequestMapping(path = "/waterlog", produces = MediaType.APPLICATION_JSON_VALUE)
public class WaterLogApiHandler
{
	@Autowired
	private WaterLogService waterLogService;

	@PostMapping(path = "/log", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void logWaterForPlant(WaterLog waterLog){
		this.waterLogService.logWaterForPlant(waterLog);
	}

	@GetMapping(path = "/getForDate", params = "date")
	public void getWaterLogForDate(@RequestParam String date){

	}

	@GetMapping(path = "/getForPlant/{id}")
	public void getWaterLogForPlant(@PathVariable Long id){

	}

	@GetMapping(path = "/getAll")
	public List<WaterLog> getCompleteWaterLog(){
		return this.waterLogService.getCompleteWaterLog();
	}

	@GetMapping(path = "/getForPlantAndDate", params = {"id", "date"})
	public void getWaterLogForPlantOnDate(@RequestParam Long id, @RequestParam String date){

	}
}
