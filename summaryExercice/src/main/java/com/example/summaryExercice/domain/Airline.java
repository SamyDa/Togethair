package com.example.summaryExercice.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Airline extends User {
	
	private String airlineName; 
	private String airlineAcronym;
	//List<Flights> flights;

}
