package com.intergalactic.homehub.model.plants;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class PlantRecord
{
	enum PlantSize {
		TINY,
		SMALL,
		SMALLMEDIUM,
		MEDIUM,
		LARGE
	}

	enum LightExposure {
		BRIGHTSUNLIGHT,
		MEDIUMSUNLIGHT,
		SHADE
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String type;

	private String purpose;

	private PlantSize size;

	private LightExposure exposure;

	private String dateOfPurchase;

	private Integer lowerMoistureThreshold;

	private Integer upperMoistureThreshold;

	public PlantRecord(String name, String type, String purpose, PlantSize plantSize, LightExposure exposure, String dateOfPurchase, Integer lowerMoistureThreshold, Integer upperMoistureThreshold){
		this.name = name;
		this.type = type;
		this.purpose = purpose;
		this.size = plantSize;
		this.exposure = exposure;
		this.dateOfPurchase = dateOfPurchase;
		this.lowerMoistureThreshold = lowerMoistureThreshold;
		this.upperMoistureThreshold = upperMoistureThreshold;
	}
}
