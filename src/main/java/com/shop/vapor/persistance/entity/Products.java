package com.shop.vapor.persistance.entity;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

public class Products {
    private int id;
    private String productName;
    private String productDescribe;
    private int price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Orders orders;

    public Products(){
    }

    public Products(int id, String productName, String productDescribe, int price, Orders orders) {
        this.id = id;
        this.productName = productName;
        this.productDescribe = productDescribe;
        this.price = price;
        this.orders = orders;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescribe() {
        return productDescribe;
    }

    public void setProductDescribe(String productDescribe) {
        this.productDescribe = productDescribe;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (id != products.id) return false;
        if (price != products.price) return false;
        if (!productName.equals(products.productName)) return false;
        if (!productDescribe.equals(products.productDescribe)) return false;
        return orders.equals(products.orders);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + productName.hashCode();
        result = 31 * result + productDescribe.hashCode();
        result = 31 * result + price;
        result = 31 * result + orders.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescribe='" + productDescribe + '\'' +
                ", price=" + price +
                ", orders=" + orders +
                '}';
    }
}
