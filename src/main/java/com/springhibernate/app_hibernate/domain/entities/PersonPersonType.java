package com.springhibernate.app_hibernate.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "personatipopersona")
public class PersonPersonType {

    @EmbeddedId
    PersonPersonTypePk id;

    @ManyToOne
    @JoinColumn(name = "id_person", insertable = false, updatable = false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "id_persontype", insertable = false, updatable = false)
    private PersonType personType;

    public PersonPersonTypePk getId() {
        return id;
    }

    public void setId(PersonPersonTypePk id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(PersonType personType) {
        this.personType = personType;
    }


}
