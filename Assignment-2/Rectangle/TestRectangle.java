/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

import java.util.Scanner;

/**
 *
 * @author haseeb
 */
public class TestRectangle {

    private static Scanner input=new Scanner(System.in);

public static void main(String [] args ){

   
    Rectangle rectangle1=new Rectangle();
      
      System.out.println(" Enter Length ");
       float length=input.nextFloat();
       
       rectangle1.setLength(length);
       
       System.out.println(" Enter Width ");
       float width=input.nextFloat();
       
       rectangle1.setWidth(width);
       
       // printing data 
       System.out.println(rectangle1);
       
       
       
       

}    
}
