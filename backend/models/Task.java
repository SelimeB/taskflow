package com.taskflow.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant; // Use for dueDate

import lombok.Data; 
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor; 

@Entity
@Table(name = "tasks") // Change table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    
    // PRIMARY KEY (Standard)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // ATTRIBUTES (Columns) for Task
    private String title;
    private String description;
    private String status; // e.g., 'TO_DO', 'IN_PROGRESS', 'DONE'
    private Instant dueDate; // When the task should be completed

    // Foreign Keys (Will be converted to relationships later)
    private Long assignedTo; 
    private Long projectId;
}