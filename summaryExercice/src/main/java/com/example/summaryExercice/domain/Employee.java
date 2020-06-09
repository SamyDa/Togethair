package com.example.summaryExercice.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("E")
public class Employee extends User{
	private String firstName;
	private String lastName;
	
}
