/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author haseeb
 */
public class TestBook {
  
    public static void main(String [] args){
       
        Book book1=new Book("OOP",12344,500,false);
        Book book2=new Book("ODE",234234,400,true);
        Book book3=new Book("Linear Algebra",34534,800,false);
        
         System.out.println(book1);
         System.out.println("=======================");
         System.out.println(book2);
         System.out.println("=======================");
         System.out.println(book3);
        System.out.println(book3.isOnloan());
    }
    
}
