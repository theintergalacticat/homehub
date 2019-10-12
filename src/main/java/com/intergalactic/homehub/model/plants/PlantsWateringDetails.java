package com.intergalactic.homehub.model.plants;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class PlantsWateringDetails
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private final LocalDate dateOfWatering;
	private final String nameOfPlant;
	private final int soilTemperature;

	@JsonIgnore
	public List<PlantsWateringDetails> getMockData()
	{
		List<PlantsWateringDetails> plantsWateringDetailsList = new ArrayList<>();
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Dracena", 30));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Orchid, Big", 35));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Orchid, Small", 33));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Ivy, Big potter", 32));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Ivy, Small potter", 30));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Fern", 31));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Leafy Fern", 32));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Spider Lily", 30));
		plantsWateringDetailsList.add(new PlantsWateringDetails(LocalDate.now(), "Spring Cactus", 35));
		return plantsWateringDetailsList;
	}
}
