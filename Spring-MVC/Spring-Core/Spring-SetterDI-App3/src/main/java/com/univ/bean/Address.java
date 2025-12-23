package com.univ.bean;

public class Address {
    private int hNo;
    private String street;
    private String city;

    public Address() {
        super();
    }

    public void setHNo(int hNo) {
        this.hNo = hNo;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + "]";
    }
}
