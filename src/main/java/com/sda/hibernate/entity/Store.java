package com.sda.hibernate.entity;

import javax.persistence.*;
import java.util.Set;

@Entity

public class Store {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int store_id;
    @Column(nullable = false)
    private int manager_staff_id;
    @Column
    private int address_id;

    @OneToMany(cascade = CascadeType.ALL)
    Set<Customer> customers;

    public Store(int manager_staff_id, int address_id) {
        this.manager_staff_id = manager_staff_id;
        this.address_id = address_id;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public int getManager_staff_id() {
        return manager_staff_id;
    }

    public void setManager_staff_id(int manager_staff_id) {
        this.manager_staff_id = manager_staff_id;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
}
