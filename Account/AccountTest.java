/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Account;


import java.util.Scanner;


/**
 *
 * @author haseeb
 */
public class AccountTest {
   
    private static Scanner input=new Scanner(System.in);
    public static void main(String [] args){
        
        System.out.println(" ENTER YOUR NAME ");
          String name=input.nextLine();
          System.out.println(" ENTER YOUR BALANCE To store in account ");
          double balance=input.nextDouble();
          
        Account account1=new Account(name,balance);
        
          System.out.println(" Enter money to deposte in account");
          
          double deposite=input.nextDouble();
          account1.deposite(deposite);
          
          System.out.println(" your final balance is "+account1.getBalance());
          
          System.out.println(" enter money you want to with draw");
          double draw=input.nextDouble();
          
          account1.withDraw(draw);
         System.out.println(" you with draw money "+draw);
        
         System.out.println( " Your Reaming money is "+account1.getBalance());
         
        
    }
}
