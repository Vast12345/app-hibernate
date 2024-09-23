/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.springhibernate.app_hibernate.domain.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 *
 * @author camper
 */
@Embeddable
public class TransactionDetailPk implements Serializable{

    @Column(name="id_antique")
    private Long idAntique;

    @Column(name="id_transaction")
    private Long idTransaction;

    public Long getIdAntique() {
        return idAntique;
    }

    public void setIdAntique(Long idAntique) {
        this.idAntique = idAntique;
    }

    public Long getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Long idTransaction) {
        this.idTransaction = idTransaction;
    }


}
