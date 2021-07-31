package com.pojo;

import com.exceptions.InvalidPriceException;

public abstract class Product {

    protected double price;
    protected String productID;

    public Product(String lineFromFile) throws InvalidPriceException {
        String[] productDetails = lineFromFile.split(", ");
        price = Double.parseDouble(productDetails[2]);
        if (price < 0) {
            throw new InvalidPriceException("Invalid price provided.");
        }
        productID = productDetails[1];
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public abstract void printProductDetails();

}