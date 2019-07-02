package com.intergalactic.homehub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

	@RequestMapping("/home")
	String selectionScreen(){
		return "Plants, Workout, Reminders, Bills";
	}

	public static void main(String[] args){
		SpringApplication.run(MainPageApiHandler.class, args);
	}

}
