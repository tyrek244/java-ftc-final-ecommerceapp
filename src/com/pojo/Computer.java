package com.pojo;

public class Computer extends Product {
    String brand;

    public Computer(String brand, double inputPrice, ECommerceProductType eCommerceProductType) {
        super(inputPrice, eCommerceProductType);
        this.brand = brand;
    }

    public Computer(String lineFromFile) {
        super(lineFromFile);
        String[] productInfo = lineFromFile.split(", ");
        brand = productInfo[3];
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product Type: COMPUTER");
        System.out.println("Product ID: " + productCode);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
    }
}