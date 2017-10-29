package com.shop.vapor.persistance.entity;

import javax.persistence.*;
import java.util.List;

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
    @OneToMany(fetch = FetchType.LAZY , mappedBy = "user")
    private List<Order> orders;

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
        this.orders = user.getOrders();
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

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        if (secondName != null ? !secondName.equals(user.secondName) : user.secondName != null) return false;
        if (dateOfBirthday != null ? !dateOfBirthday.equals(user.dateOfBirthday) : user.dateOfBirthday != null)
            return false;
        if (mobileNumber != null ? !mobileNumber.equals(user.mobileNumber) : user.mobileNumber != null) return false;
        if (address != null ? !address.equals(user.address) : user.address != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (role != null ? !role.equals(user.role) : user.role != null) return false;
        return orders != null ? orders.equals(user.orders) : user.orders == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (dateOfBirthday != null ? dateOfBirthday.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
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
                ", orders=" + orders +
                '}';
    }
}