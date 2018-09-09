package com.sda.hibernate.entity;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int customer_id;
    @Column
    private int store_id;
    @Column
    private int address_id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Store store;

    public Customer(int store_id, int address_id) {
        this.store_id = store_id;
        this.address_id = address_id;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
}
