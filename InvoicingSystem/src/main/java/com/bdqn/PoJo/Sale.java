package com.bdqn.PoJo;

/**
 * Created by sony on 2017/11/27.
 */

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 FieldTypeComment
 idint(11) NOT NULL记录id
 pricedouble NOT NULL销售单价
 quantityint(11) NOT NULL销售数量
 totalPricedouble NOT NULL总价
 saleDatedatetime NOT NULL销售日期
 userIdint(11) NOT NULL销售员id
 productIdint(11) NOT NULL商品id
 */
public class Sale {
    private Integer id;
    private double price;
    private Integer quantity;
    private double totalPrice;
    private Date saleDate;
    private Integer userId;
    private Integer productId;

    private String userName;
    private String productName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", saleDateTime=" +new  SimpleDateFormat("yyyy-MM-dd").format(new Date()) +
                ", userId=" + userId +
                ", productId=" + productId +
                ", userName='" + userName + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDateTime(Date saleDate) {
        this.saleDate = saleDate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }
}
