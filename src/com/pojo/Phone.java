package com.pojo;

import com.exceptions.InvalidPriceException;

public class Phone extends Product{

    String brand;

    public Phone(String lineFromFile) throws InvalidPriceException {
        super(lineFromFile);
        String[] productInfo = lineFromFile.split(", ");
        brand = (productInfo[3] + ", " + productInfo[4]);
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product Type: PHONE");
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }
}