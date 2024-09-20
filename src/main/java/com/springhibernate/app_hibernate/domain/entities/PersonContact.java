package com.springhibernate.app_hibernate.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactopersona")
public class PersonContact {

    @EmbeddedId
    private PersonContactPk personContactPk;

    @ManyToOne
    @JoinColumn(name = "id_person", insertable=false, updatable=false)
    private Person person;

    @ManyToOne
    @JoinColumn(name = "id_contact", insertable=false, updatable = false)
    private Contact contact;

    public PersonContactPk getPersonContactPk() {
        return personContactPk;
    }

    public void setPersonContactPk(PersonContactPk personContactPk) {
        this.personContactPk = personContactPk;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
