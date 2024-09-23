package com.springhibernate.app_hibernate.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "antiguedades")
public class Antique {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable=false)
    private String name;

    @Column(nullable=false)
    private String description;

    @Column(name = "date_added",nullable=false)
    private LocalDateTime dateAdded;

    @ManyToOne
    private Branch branch;



    public Antique() {
    }

    public Antique(String name, String description, LocalDateTime dateAdded, Branch branch) {
        this.name = name;
        this.description = description;
        this.dateAdded = LocalDateTime.now();
        this.branch = branch;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateAdded() {
        return dateAdded;
    }

    public void setStock(LocalDateTime dateAdded) {
        this.dateAdded = dateAdded;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    
}
