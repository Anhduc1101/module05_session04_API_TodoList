package com.ra.model.dto;

public class ProductDTO {
    private Long id;
    private String productName;

    private Boolean status =true;

    private Long categoryId;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String productName, Boolean status, Long categoryId) {
        this.id = id;
        this.productName = productName;
        this.status = status;
        this.categoryId = categoryId;
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

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
