package com.pojo;

import com.exceptions.InvalidPriceException;

public class Computer extends Product {
    String brand;

    public Computer(String lineFromFile) throws InvalidPriceException {
        super(lineFromFile);
        String[] productInfo = lineFromFile.split(", ");
        brand = productInfo[3];
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product Type: COMPUTER");
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }
}