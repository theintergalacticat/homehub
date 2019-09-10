package com.intergalactic.homehub.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component("plantsWateringDetails")
public class PlantsWateringDetails
{
	private LocalDate dateOfWatering;
	private String nameOfPlant;
	private int soilTemperature;

	private PlantsWateringDetails newPlantsWateringDetails(LocalDate dateOfWatering, String nameOfPlant, int soilTemperature)
	{
		PlantsWateringDetails plantsWateringDetails = new PlantsWateringDetails();
		plantsWateringDetails.dateOfWatering = dateOfWatering;
		plantsWateringDetails.nameOfPlant = nameOfPlant;
		plantsWateringDetails.soilTemperature = soilTemperature;
		return plantsWateringDetails;
	}

	public LocalDate getDateOfWatering()
	{
		return dateOfWatering;
	}

	public void setDateOfWatering(LocalDate dateOfWatering)
	{
		this.dateOfWatering = dateOfWatering;
	}

	public String getNameOfPlant()
	{
		return nameOfPlant;
	}

	public void setNameOfPlant(String nameOfPlant)
	{
		this.nameOfPlant = nameOfPlant;
	}

	public int getSoilTemperature()
	{
		return soilTemperature;
	}

	public void setSoilTemperature(int soilTemperature)
	{
		this.soilTemperature = soilTemperature;
	}

	@JsonIgnore
	public List<PlantsWateringDetails> getMockData()
	{
		List<PlantsWateringDetails> plantsWateringDetailsList = new ArrayList<>();
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Dracena", 30));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Orchid, Big", 35));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Orchid, Small", 33));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Ivy, Big potter", 32));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Ivy, Small potter", 30));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Fern", 31));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Leafy Fern", 32));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Spider Lily", 30));
		plantsWateringDetailsList.add(newPlantsWateringDetails(LocalDate.now(), "Spring Cactus", 35));
		return plantsWateringDetailsList;
	}
}
