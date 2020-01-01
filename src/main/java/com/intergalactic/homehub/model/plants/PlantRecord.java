package com.intergalactic.homehub.model.plants;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
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
}
