package com.pojo;

import com.exceptions.CustomException;
import com.exceptions.InvalidPriceException;

public class Book extends Product{

    private String title;
    private String author;


    public Book(String lineFromFile) throws CustomException, InvalidPriceException {
        super(lineFromFile);
        String[] productInfo = lineFromFile.split(", ");
        title = productInfo[3];
        if(title == null) {
            throw new CustomException("Invalid title provided");
        }
        author = productInfo[4];
    }

    public void printProductDetails(){
        System.out.println("Product Type: BOOK");
        System.out.println("Product ID: " + productID);
        System.out.println("Price: $" + price);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}