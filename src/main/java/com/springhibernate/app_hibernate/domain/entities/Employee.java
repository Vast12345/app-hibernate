package com.springhibernate.app_hibernate.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Employee {

    @Id
    @Column(name = "id_person")
    private Long id;

    @Column(length = 25, nullable = false)
    private String cargo;

    @OneToOne
    @MapsId // indicates that the primary key values will be copied from the Person entity.
    @JoinColumn(name = "id_person")
    private Person person;

    public Employee() {
    }

    public Employee(String cargo, Person person) {
        this.cargo = cargo;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


}
