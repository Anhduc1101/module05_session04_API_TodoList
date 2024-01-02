package com.ra.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String phone;
    private String note;
    private float total;
    @Column(columnDefinition = "int default 1")
    private int status=1;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(mappedBy = "orders")
    private Set<OrderDetails> orderDetails;

    public Orders() {
    }

    public Orders(Long id, String address, String phone, String note, float total, int status, User user, Set<OrderDetails> orderDetails) {
        this.id = id;
        this.address = address;
        this.phone = phone;
        this.note = note;
        this.total = total;
        this.status = status;
        this.user = user;
        this.orderDetails = orderDetails;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
