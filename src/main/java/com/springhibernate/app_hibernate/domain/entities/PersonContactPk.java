package com.springhibernate.app_hibernate.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PersonContactPk implements Serializable{

    @Column(name = "id_person")
    private Long id_person;

    @Column(name = "id_contact")
    private Long id_contact;

    public Long getId_person() {
        return id_person;
    }

    public void setId_person(Long id_person) {
        this.id_person = id_person;
    }

    public Long getId_contact() {
        return id_contact;
    }

    public void setId_contact(Long id_contact) {
        this.id_contact = id_contact;
    }


}
