package com.univ.entities;

import javax.persistence.*;

@Entity
@Table(name = "fruitdetails")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fruitId")
    private int fId;

    @Column(name = "fruitName")
    private String fName;

    @Column(name = "fruitQuantity")
    private int quantity;

    @Column(name = "fruitPrice")
    private double price;

    public Fruit() {
        super();
    }

    public Fruit(int fId, String fName, int quantity, double price) {
        this.fId = fId;
        this.fName = fName;
        this.quantity = quantity;
        this.price = price;
    }

    // ✅ Getter and Setter for fId
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    // ✅ Getter and Setter for fName
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    // ✅ Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // ✅ Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Optional: toString()
    @Override
    public String toString() {
        return fId + "\t" + fName + "\t" + quantity + "\t" + price;
    }
}
