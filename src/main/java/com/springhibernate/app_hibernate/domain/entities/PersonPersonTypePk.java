package com.springhibernate.app_hibernate.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PersonPersonTypePk implements Serializable{

    @Column(name = "id_person")
    private Long idperson;
    @Column(name = "id_persontype")
    private Long idpersontype;

    public Long getIdperson() {
        return idperson;
    }

    public void setIdperson(Long idperson) {
        this.idperson = idperson;
    }

    public Long getIdpersontype() {
        return idpersontype;
    }

    public void setIdpersontype(Long idpersontype) {
        this.idpersontype = idpersontype;
    }


}
