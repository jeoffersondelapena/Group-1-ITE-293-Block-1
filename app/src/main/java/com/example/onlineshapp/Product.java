package com.example.onlineshapp;

public class Product {

    private int id;
    private String prodName;
    private String prodDetails;
    private double prodPrice;
    private int prodImg;
    private boolean isAddedToCart;

    public Product(int id, String prodName, String prodDetails, double prodPrice, int prodImg, boolean isAddedToCart) {
        this.id = id;
        this.prodName = prodName;
        this.prodDetails = prodDetails;
        this.prodPrice = prodPrice;
        this.prodImg = prodImg;
        this.isAddedToCart = isAddedToCart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdDetails() {
        return prodDetails;
    }

    public void setProdDetails(String prodDetails) {
        this.prodDetails = prodDetails;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getProdImg() {
        return prodImg;
    }

    public void setProdImg(int prodImg) {
        this.prodImg = prodImg;
    }

    public boolean isAddedToCart() {
        return isAddedToCart;
    }

    public void setAddedToCart(boolean addedToCart) {
        isAddedToCart = addedToCart;
    }

}

