package com.intergalactic.homehub.model.plants;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

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

	private LocalDate dateOfPurchase;

	private Integer lowerMoistureThreshold;

	private Integer upperMoistureThreshold;


}
