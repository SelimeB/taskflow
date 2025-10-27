package com.taskflow.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant; // Used for the createdAt timestamp

import lombok.Data; 
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor; 

@Entity
@Table(name = "projects") // Change table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    
    // PRIMARY KEY (Standard)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // ATTRIBUTES (Columns) for Project
    private String name;
    private String description;
    
    // Will be converted to a relationship with the User entity later
    private Long createdBy; 
    
    private Instant createdAt; // Use Instant for timestamps
}