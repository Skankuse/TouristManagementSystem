package com.Springboot.TourismManagemnt.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HolidayPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long packageId;
    private String name;
    private String description;
    private int price;
    private int duration;
    private String location;
    private String adventureType;
    
    // Constructors, getters, and setters
}

