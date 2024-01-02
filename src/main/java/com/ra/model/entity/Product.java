package com.ra.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productName;
    @Column(columnDefinition = "Boolean default true")
    private Boolean status =true;
    @ManyToOne
    @JoinColumn(name = "catId",referencedColumnName = "id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<OrderDetails> orderDetail;

    public Product() {
    }

    public Product(Long id, String productName, Boolean status, Category category, Set<OrderDetails> orderDetail) {
        this.id = id;
        this.productName = productName;
        this.status = status;
        this.category = category;
        this.orderDetail = orderDetail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<OrderDetails> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(Set<OrderDetails> orderDetail) {
        this.orderDetail = orderDetail;
    }
}
