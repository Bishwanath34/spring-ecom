package com.bish.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String  description;
    private String brand;
    private BigDecimal price;
    private String category;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    private Date releaseDate;

    private boolean  productAvailable;
    private int stockQuantity;
private String imageName;
private String imageType;
@Lob
private byte[] imageDate;
    public Product() {}

    public Product(int id, String name, String desc, String brand, BigDecimal price, String category, Date releaseDate, boolean available, int quantity) {
        this.id = id;
        this.name = name;
        this.description = desc;
        this.brand = brand;
        this.price = price;
        this.category = category;
        this.releaseDate = releaseDate;
        this.productAvailable = available;
        this.stockQuantity = quantity;
    }

    // Getters and Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDesc() { return description; }
    public void setDesc(String desc) { this.description = desc; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Date getReleaseDate() { return releaseDate; }
    public void setReleaseDate(Date releaseDate) { this.releaseDate = releaseDate; }

    public boolean isAvailable() { return productAvailable; }
    public void setAvailable(boolean available) { this.productAvailable = available; }

    public int getQuantity() { return stockQuantity; }
    public void setQuantity(int quantity) { this.stockQuantity = quantity; }

    public void setImageName(String originalFilename) {
        this.imageName=originalFilename;
    }

    public void setImageType(String contentType) {
        this.imageType=contentType;
    }

    public void setImageDate(byte[] bytes) {
        this.imageDate=bytes;
    }

    public String getDescription() {
        return description;
    }

    public boolean isProductAvailable() {
        return productAvailable;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageType() {
        return imageType;
    }

    public byte[] getImageDate() {
        return imageDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", desc='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", releaseDate=" + releaseDate +
                ", available=" + productAvailable +
                ", quantity=" + stockQuantity +
                ", imageName='" + imageName + '\'' +
                ", imageType='" + imageType + '\'' +
                ", imageDate=" + Arrays.toString(imageDate) +
                '}';
    }
}
