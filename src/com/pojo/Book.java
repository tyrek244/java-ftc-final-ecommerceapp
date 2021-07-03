package com.pojo;

import com.exceptions.CustomException;
import com.exceptions.InvalidPriceException;

public class Book extends Product{

    private String title;
    private String author;

    public Book(String newTitle, String newAuthor, double price, ECommerceProductType eCommerceProductType) throws InvalidPriceException, CustomException{
        super(price, eCommerceProductType);
        if(newTitle == null) {
            throw new CustomException("Invalid title provided");
        }
        title = newTitle;
        author = newAuthor;
    }

    public Book(String lineFromFile) {
        super(lineFromFile);
        String[] productInfo = lineFromFile.split(", ");
        title = productInfo[3];
        author = productInfo[4];
    }

    public void printProductDetails(){
        System.out.println("Product Type: BOOK");
        System.out.println("Product ID: " + productCode);
        System.out.println("Price: $" + price);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}