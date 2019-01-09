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
public class Book extends Product {
    private String authorName;
    
    public Book(int id, String name, double price, int quantity, Date date, double discount, String author){
        super(id, name, price, quantity, date, discount);
        this.authorName = author;
    }
    
    public void setAuthor(String author){
        this.authorName = author;
    }
    
    public String getAuthor(){return this.authorName;}
    
    public String toString(){
        return String.format("%s%n Author Name: %s%n", super.toString(), getAuthor());
    }
}
