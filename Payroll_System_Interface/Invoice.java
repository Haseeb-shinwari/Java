/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payrollsystempackage;

/**
 *
 * @author Ali
 */
public class Invoice implements Payable {
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    @Override
    public double getPaymentAmount()
    {
        return getQuantity() * getPrice();
    }

    @Override
    public String toString() {
        return "Invoice{" + "partNumber=" + partNumber + ", partDescription=" + partDescription + ", quantity=" + quantity + ", price=" + price + '}';
    }
    
    
}
