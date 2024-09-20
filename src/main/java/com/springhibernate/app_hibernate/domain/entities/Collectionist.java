package com.springhibernate.app_hibernate.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coleccionistas")
public class Collectionist {

    @Id
    @Column(name = "id_person")
    private Long id;

    @Column(length =  50, nullable = true)
    private String collectortype;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_person")
    private Person person;

    public Collectionist() {
    }

    public Collectionist(String collectortype, Person person) {
        this.collectortype = collectortype;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCollectortype() {
        return collectortype;
    }

    public void setCollectortype(String collectortype) {
        this.collectortype = collectortype;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    
}
