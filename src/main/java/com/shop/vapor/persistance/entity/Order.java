package com.shop.vapor.persistance.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    private int id;
    private String date;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    private List<Product> products;

    public Order() {

    }

    public Order(int id, String date, User user, List<Product> products) {
        this.id = id;
        this.date = date;
        this.user = user;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order Order = (Order) o;

        if (id != Order.id) return false;
        if (date != null ? !date.equals(Order.date) : Order.date != null) return false;
        if (user != null ? !user.equals(Order.user) : Order.user != null) return false;
        return products != null ? products.equals(Order.products) : Order.products == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        result = 31 * result + (products != null ? products.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", user=" + user +
                ", products=" + products +
                '}';
    }
}