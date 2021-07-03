package com.pojo;

public class Phone extends Product{

    String brand;
    //double height;
    //double width;

    public Phone(String phoneBrand, double phoneHeight, double phoneWidth, double phonePrice, ECommerceProductType eCommerceProductType) {
        super(phonePrice, eCommerceProductType);
        this.brand = phoneBrand;
        //this.height = phoneHeight;
        //this.width = phoneWidth;
    }

    public Phone(String lineFromFile) {
        super(lineFromFile);
        String[] productInfo = lineFromFile.split(", ");
        brand = (productInfo[3] + ", " + productInfo[4]);
        //height = productInfo[];
        //width = productInfo[];
    }

    @Override
    public void printProductDetails() {
        System.out.println("Product Type: PHONE");
        System.out.println("Product ID: " + productCode);
        System.out.println("Price: $" + price);
        System.out.println("Brand: " + brand);
        //System.out.println("Height: " + height);
        //System.out.println("Width: " + width);
    }
}