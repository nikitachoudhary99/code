package com.univ.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="per")
public class Person {
    @Id
    private int perid;
    private String name;

    @ManyToMany(mappedBy="person") // <-- Fix: field name in Address class
    private Set<Address> adr = new HashSet<Address>();

    public Person() {}
    public Person(int perid, String name) {
        this.perid = perid;
        this.name = name;
    }

    // Getters and Setters
    public int getPerid() {
        return perid;
    }

    public void setPerid(int perid) {
        this.perid = perid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Address> getAdr() {
        return adr;
    }

    public void setAdr(Set<Address> adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Person=" + perid + "\t" + name;
    }
}
