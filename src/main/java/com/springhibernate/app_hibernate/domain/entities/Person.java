package com.springhibernate.app_hibernate.domain.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String email;

    @ManyToOne
    private Branch branches;

    @OneToOne(mappedBy="persona", cascade=CascadeType.ALL) // mappedBy attribute is in the Person class since the foreign key is now present in the employee table.
    @PrimaryKeyJoinColumn // Indicates that the primary key of the Person entity is used as the foreign key value for the associated Employee entity.
    private Employee employee;

    @OneToOne(mappedBy="persona", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Collectionist collectionist;

    public Person() {
    }

    public Person(String name, String email, Branch branches, Employee employee, Collectionist collectionist) {
        this.name = name;
        this.email = email;
        this.branches = branches;
        this.employee = employee;
        this.collectionist = collectionist;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Branch getBranches() {
        return branches;
    }

    public void setBranches(Branch branches) {
        this.branches = branches;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Collectionist getCollectionist() {
        return collectionist;
    }

    public void setCollectionist(Collectionist collectionist) {
        this.collectionist = collectionist;
    }


}
