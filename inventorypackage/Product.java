/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventorypackage;

/**
 *
 * @author Ali
 */
public class Product {
    private int productID;
    private String productName;
    private double price;
    private int quantity;
    private Date purchaseDate;
    private double discountRate;
    
    public Product(int id, String name, double price, int quantity, Date date, double discount){
        this.productID = id;
        this.productName = name;
        this.price = price;
        this.quantity = quantity;
        this.purchaseDate = date;
        this.discountRate = discount;
    }
    
    public void setID(int id){
        this.productID = id;
    }
    
    public int getID(){return productID;}
    
    public void setName(String name){
        this.productName = name;
    } 
    
    public String getName(){return productName;}
    
    public void setPrice(double price){
        if(price < 0)
            throw new IllegalArgumentException("Price cannot be negative");
        this.price = price;
    }
    
    public double getPrice(){return this.price;}
    
    public void setItemQuantity(int quantity){
        if(quantity < 0)
            throw new IllegalArgumentException("Item quantiry cannot be negative");
        this.quantity = quantity;
    }
    
    public int getItemQuantity(){return this.quantity;}
    
    public void setDate(Date date){
        this.purchaseDate = date;
    }
    
    public Date getDate(){return this.purchaseDate;}
    
    public void setDiscountRate(double discount)
    {this.discountRate = discount;}
    public double getDiscountRate(){return discountRate;}
    public double discountedPrice(){
        return getPrice() - (getPrice()*getDiscountRate());
       // System.out.printf("Discounted price is: %.2f%n", price);
    }
    
    public String toString(){
        return String.format("Product ID: %d%n Product Name: %s%n Price: %.2f%n Discounted price: %.2f%n"
                + "Quantity: %d%n Arrival Date: %s%n ", 
                getID(), getName(), getPrice(), this.discountedPrice(), getItemQuantity(), getDate());
    }
}
