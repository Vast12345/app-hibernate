/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.springhibernate.app_hibernate.domain.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 *
 * @author camper
 */
@Entity
@Table(name="detalletransaccion")
public class TransactionDetail {

    @EmbeddedId
    TransactionDetailPk id;

    @ManyToOne
    @JoinColumn(name="id_anqtique", insertable=false, updatable=false)
    private Antique antique;

    @ManyToOne
    @JoinColumn(name="id_transaction", insertable=false, updatable=false)
    private Transaction transaction;

    private int quantity;

    private Double price;

    public TransactionDetailPk getId() {
        return id;
    }

    public void setId(TransactionDetailPk id) {
        this.id = id;
    }

    public Antique getAntique() {
        return antique;
    }

    public void setAntique(Antique antique) {
        this.antique = antique;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


}
