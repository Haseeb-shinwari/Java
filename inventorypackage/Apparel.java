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
public class Apparel extends Product {
    private String season;
    private double seasonalDiscount;
    
    public Apparel(int id, String name, double price, int quantity, Date date, double discount, String season, double seasonal){
        super(id, name, price, quantity, date, discount);
        this.season = season;
        this.seasonalDiscount = seasonal;
    }
    
    public void setSeason(String season){
        this.season = season;
    }
    
    public String getSeason(){return this.season;}
    
    public double getSeasonalDiscount(){return this.seasonalDiscount;}
    
    @Override
    public double discountedPrice(){
        return super.discountedPrice()-(super.getPrice()*getSeasonalDiscount());
    }
    
    public String toString(){
        return String.format("%s%n Season: %s%n Seasonal Price: %.2f%n", super.toString(), getSeason(), this.discountedPrice());
    }
    
}
