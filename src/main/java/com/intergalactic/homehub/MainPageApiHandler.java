package com.intergalactic.homehub;

import com.intergalactic.homehub.apihandlers.plants.PlantsApiHandler;
import com.intergalactic.homehub.model.User;
import com.intergalactic.homehub.repository.InMemoryUserRepository;
import com.intergalactic.homehub.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MainPageApiHandler
{
	@RequestMapping("/")
	String home(){
		return "Hello World";
	}

	@RequestMapping("/user")
	@CrossOrigin(origins = "http://localhost:4200")
	public User getUser(){
		return new User();
	}

	@RequestMapping("/home")
	String selectionScreen(){
		return "Plants, Workout, Reminders, Bills";
	}

	public static void main(String[] args){
		SpringApplication.run(new Class[] { MainPageApiHandler.class, PlantsApiHandler.class }, args);
	}

	@Bean
	public UserRepository userRepository()
	{
		return new InMemoryUserRepository();
	}
}
