package com.Springboot.TourismManagemnt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
	public class User 
	{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userId;
	    private String username;
	    private String password;
	    private String email;
	    private String phoneNumber;
	    
	    // Getters and setters
	}
