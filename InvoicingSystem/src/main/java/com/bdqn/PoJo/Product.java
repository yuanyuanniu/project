package com.bdqn.PoJo;

/**
 * Created by sony on 2017/11/27.
 */

/**
 *
 FieldTypeComment
 idint(11) NOT NULL商品id
 productNamevarchar(50) NOT NULL商品名称
 quantityint(11) NOT NULL库存


 */
public class Product {
    private Integer id;
    private String productName;
    private Integer quantity;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
