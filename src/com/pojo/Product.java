package com.pojo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Product {

    protected double price;
    protected ECommerceProductType eCommerceProductType;
    protected String productCode;
    protected int stock;

    public Product(double inputPrice, ECommerceProductType eCommerceProductTypeInputArgument) {
        this.eCommerceProductType = eCommerceProductTypeInputArgument;
        this.price = inputPrice;
    }

    public Product(String lineFromFile) {
        String[] productDetails = lineFromFile.split(", ");
        price = Double.parseDouble(productDetails[2]);
        productCode = productDetails[1];
        stock = 0;
    }

    public String getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public void increaseStock() {
        stock += 1;
    }

    public void printStock() {
        System.out.print("Stock: " + stock);
    }

    public abstract void printProductDetails();

}