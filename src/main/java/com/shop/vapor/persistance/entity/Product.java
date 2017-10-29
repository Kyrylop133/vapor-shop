package com.shop.vapor.persistance.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="product")
public class Product {
    @Id
    private int id;
    private String productName;
    private String productDescribe;
    private int price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Order orders;

    public Product(){
    }

    public Product(int id, String productName, String productDescribe, int price, Order orders) {
        this.id = id;
        this.productName = productName;
        this.productDescribe = productDescribe;
        this.price = price;
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productDescribe='" + productDescribe + '\'' +
                ", price=" + price +
                ", orders=" + orders +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (id != product.id) return false;
        if (price != product.price) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productDescribe != null ? !productDescribe.equals(product.productDescribe) : product.productDescribe != null)
            return false;
        return orders != null ? orders.equals(product.orders) : product.orders == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productDescribe != null ? productDescribe.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + (orders != null ? orders.hashCode() : 0);
        return result;
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

    public Order getOrders() {
        return orders;
    }

    public void setOrders(Order orders) {
        this.orders = orders;
    }
}
