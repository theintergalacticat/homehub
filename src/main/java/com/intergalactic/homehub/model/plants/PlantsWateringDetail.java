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

	private final String nameOfPlant;

	private final int soilTemperature;

	private final LocalDate dateOfWatering;

	@JsonIgnore
	public static List<PlantsWateringDetails> getMockData()
	{
		List<PlantsWateringDetails> plantsWateringDetailsList = new ArrayList<>();
		plantsWateringDetailsList.add(new PlantsWateringDetails("Dracena", 30, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Orchid, Big", 35, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Orchid, Small", 33, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Ivy, Big potter", 32, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Ivy, Small potter", 30, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Fern", 31, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Leafy Fern", 32, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Spider Lily", 30, LocalDate.now()));
		plantsWateringDetailsList.add(new PlantsWateringDetails("Spring Cactus", 35, LocalDate.now()));
		return plantsWateringDetailsList;
	}
}
