package com.teju.SpringEcom.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  // ✅ Changed from int to Integer

    private String name;
    private String description;
    private String brand;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    private String category;

    @Temporal(TemporalType.DATE)
    @Column(name = "release_date")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;

    @Column(name = "product_available")
    private Boolean productAvailable;  // ✅ Changed from boolean to Boolean

    @Column(name = "stock_quantity")
    private Integer stockQuantity;  // ✅ Changed from int to Integer

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "image_type")
    private String imageType;

    @Column(name = "image_data", columnDefinition = "bytea")
    private byte[] imageData;

    // No-args constructor (required by JPA)
    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    // Getters and Setters
    public Integer getId() {  // ✅ Changed return type
        return id;
    }

    public void setId(Integer id) {  // ✅ Changed parameter type
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Boolean getProductAvailable() {  // ✅ Changed return type
        return productAvailable;
    }

    public void setProductAvailable(Boolean productAvailable) {  // ✅ Changed parameter type
        this.productAvailable = productAvailable;
    }

    public Integer getStockQuantity() {  // ✅ Changed return type
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {  // ✅ Changed parameter type
        this.stockQuantity = stockQuantity;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public byte[] getImageData() {
        return imageData;
    }

    public void setImageData(byte[] imageData) {
        this.imageData = imageData;
    }
}