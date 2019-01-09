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
public class ProductInventory {
    public static void main(String[] args){
        Date date = new Date(6, 6, 2014);
        Product q = new Product(788, "Book", 200.50, 10, date, .20);
        System.out.println(q);
        
       // q.discountedPrice(.2);
        
        Apparel a = new Apparel(9, "Jumper", 500, 15, date, .10, "Winter", .50);
        System.out.println(a);
        
        Book b = new Book(9, "OOP with Java", 500, 15, date, .10, "Dietal");
        System.out.print(b);
        
        Product p[] = new Product[3];
        
        p[0] = new Product(788, "Item", 200.50, 10, date, .30);
        p[1] = new Apparel(9, "Jumper", 500, 15, date, .10, "Winter", .20);
        p[2] = new Book(9, "OOP with Java", 500, 15, date, .10, "Dietal");
        
        for (Product product : p)
        {
            System.out.println(product);
        }
        
    }
    
}
