package com.shop.vapor.persistance.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class User  {
    @Id
    private Integer id;
    private String firstName;
    private String secondName;
    private String dateOfBirthday;
    private String mobileNumber;
    @OneToOne
    private Address address;
    private String email;
    private String role;
    @OneToMany(fetch = FetchType.LAZY)
    private Orders orders;

    public User() {
    }
    public User(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.secondName = user.getSecondName();
        this.dateOfBirthday = user.getDateOfBirthday();
        this.mobileNumber = user.getMobileNumber();
        this.address = user.getAddress();
        this.email = user.getEmail();
        this.role = user.getRole();
    }

    public User(Integer id, String firstName, String secondName, String dateOfBirthday, String mobileNumber, Address address, String email, String role) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirthday = dateOfBirthday;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.email = email;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!id.equals(user.id)) return false;
        if (!firstName.equals(user.firstName)) return false;
        if (!secondName.equals(user.secondName)) return false;
        if (!dateOfBirthday.equals(user.dateOfBirthday)) return false;
        if (!mobileNumber.equals(user.mobileNumber)) return false;
        if (!address.equals(user.address)) return false;
        if (!email.equals(user.email)) return false;
        return role.equals(user.role);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + secondName.hashCode();
        result = 31 * result + dateOfBirthday.hashCode();
        result = 31 * result + mobileNumber.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + role.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}