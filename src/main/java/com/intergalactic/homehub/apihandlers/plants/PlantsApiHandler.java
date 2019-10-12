package com.intergalactic.homehub.apihandlers.plants;

import com.intergalactic.homehub.model.plants.PlantsWateringDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlantsApiHandler
{
	private PlantsWateringDetails plantsWateringDetails;

	@Autowired
	public PlantsApiHandler(PlantsWateringDetails plantsWateringDetails)
	{
		this.plantsWateringDetails = plantsWateringDetails;
	}

	@RequestMapping("/plantsWateringDetails")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<PlantsWateringDetails> getPlantsWateringDetails()
	{
		return plantsWateringDetails.getMockData();
	}
}
