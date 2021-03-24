package com.example.onlineshapp;

public class Product {
    private int id;
    private String prodName;
    private String prodDetails;
    private double prodPrice;
    private int prodImg;

    public Product(int id, String prodName, String prodDetails, double prodPrice, int prodImg) {
        this.id = id;
        this.prodName = prodName;
        this.prodDetails = prodDetails;
        this.prodPrice = prodPrice;
        this.prodImg = prodImg;
    }

    public int getId() {
        return id;
    }

    public String getProdName() {
        return prodName;
    }

    public String getProdDetails() {
        return prodDetails;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public int getProdImg() {
        return prodImg;
    }
}

