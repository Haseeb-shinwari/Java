/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.awt.BorderLayout;

/**
 *
 * @author haseeb
 */
public class Account {
    
    private String name;
    private double balance;
 public  Account(){
        
    }
   public  Account(String name ,double balance){
       this.name=name;
       this.balance=balance;
       
   }
   public String getName(){
       
       return name;
       
   }
   public double  getBalance(){
       
       return balance;
       
   }
   
public void  setBalance(double balance ) {
    
    if(balance>0){
        this.balance=balance;
        
    }
}
    public void  deposite(double money){
        
        this.balance+=money;
        
    }
    public double withDraw(double money){
        
       double  remaining=this.balance-money;
            this.balance=remaining;
           
            return this.balance; 
            
        
    }
    
}  
   


