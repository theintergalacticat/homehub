package com.intergalactic.homehub.repository.plants;

import com.intergalactic.homehub.model.plants.PlantsWateringDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlantsWateringRepository extends JpaRepository<PlantsWateringDetails, Long>
{
	List<PlantsWateringDetails> findAllByPlantName(String nameOfPlant);

	List<PlantsWateringDetails> findAll();
}
