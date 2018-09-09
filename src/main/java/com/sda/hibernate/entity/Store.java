package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private byte store_id;
    @Column
    private byte manager_staff_id;
    @Column
    private byte address_id;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Customer> customers;

    public Store(byte manager_staff_id, byte address_id) {
        this.manager_staff_id = manager_staff_id;
        this.address_id = address_id;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public byte getStore_id() {
        return store_id;
    }

    public void setStore_id(byte store_id) {
        this.store_id = store_id;
    }

    public byte getManager_staff_id() {
        return manager_staff_id;
    }

    public void setManager_staff_id(byte manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }

    public byte getAddress_id() {
        return address_id;
    }

    public void setAddress_id(byte address_id) {
        this.address_id = address_id;
    }
}
