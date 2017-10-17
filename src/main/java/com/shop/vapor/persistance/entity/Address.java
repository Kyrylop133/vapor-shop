package com.shop.vapor.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int id;
    private String country;
    private String city;
    private String street;
    private int houseNumber;
    private int flatNumber;
    private int zipCode;
    @OneToOne(mappedBy = "address")
    private User user;

    public Address(){
    }

    public Address(int id, String country, String city, String street, int houseNumber, int flatNumber, int zipCode, User user) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.flatNumber = flatNumber;
        this.zipCode = zipCode;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (id != address.id) return false;
        if (houseNumber != address.houseNumber) return false;
        if (flatNumber != address.flatNumber) return false;
        if (zipCode != address.zipCode) return false;
        if (!country.equals(address.country)) return false;
        if (!city.equals(address.city)) return false;
        if (!street.equals(address.street)) return false;
        return user.equals(address.user);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + country.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + houseNumber;
        result = 31 * result + flatNumber;
        result = 31 * result + zipCode;
        result = 31 * result + user.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", flatNumber=" + flatNumber +
                ", zipCode=" + zipCode +
                ", user=" + user +
                '}';
    }
}
