package com.evergent.sandeep.bean;
import java.util.Date;

public class OrderBean {
    private int orderId;
    private int userId;
    private int productId;
    private int quantity;
    private double totalPrice;
    private Date orderDate; 

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public Date getOrderDate() {
        return orderDate;
    }
}
