package com.sda.hibernate.entity;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private byte customer_id;
    @Column
    private byte store_id;
    @Column
    private byte address_id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Store store;

    public Customer(byte store_id, byte address_id) {
        this.store_id = store_id;
        this.address_id = address_id;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public byte getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(byte customer_id) {
        this.customer_id = customer_id;
    }

    public byte getStore_id() {
        return store_id;
    }

    public void setStore_id(byte store_id) {
        this.store_id = store_id;
    }

    public byte getAddress_id() {
        return address_id;
    }

    public void setAddress_id(byte address_id) {
        this.address_id = address_id;
    }
}
