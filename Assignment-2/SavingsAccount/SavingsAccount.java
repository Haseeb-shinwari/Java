/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SavingsAccount;

/**
 *
 * @author haseeb
 */
public class SavingsAccount {
    
    private  static double  annualInterestRate;
    private static double   MonthlyInterestRate;
    private static double   nextMonthInterestRate;
    private double savingsBalance;
    private double savings_Balance;
    public  SavingsAccount( double savingsBalance){
        this.savingsBalance=savingsBalance;
        
    }
    public void calculateMonthlyInterest(){
     
           savings_Balance=  (savingsBalance * annualInterestRate)/12;
        
}
    public static void modifyInterestRate(){
        
           annualInterestRate=(5/100);
            
   
    }
    public static void  calculateMonthlyInterestRate(){
        
             MonthlyInterestRate= (4/100)*12;
    }
    public static void nextMonthInterestRate(){
        
           nextMonthInterestRate=(5/100)*12;
        
    }
    
}
