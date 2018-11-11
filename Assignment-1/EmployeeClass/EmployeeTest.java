/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeClass;

/**
 *
 * @author haseeb
 */
import java.util.Scanner;

public class EmployeeTest {
    
   
    
    public static void main(String [] args){
        
         Scanner input=new Scanner(System.in);
        EmployeeClass firstEmployee=new EmployeeClass("Haseeb","khan",90000);
        System.out.printf(" Your First Name is :%s %n",firstEmployee.getFirstName());
        System.out.printf(" Your Last Name is :%s %n",firstEmployee.getLastName());
        System.out.printf(" Your Salary is :%.2f%n",firstEmployee.getMonthlySalary());
        System.out.printf(" Your yearly Salary is :%.2f %n",firstEmployee.yearlySalary());
        System.out.printf(" Yearly Salary 10 percent : %.2f %n:",firstEmployee.bonus());
        System.out.println("======================================");
        
         EmployeeClass secondEmployee=new EmployeeClass("juniad","awan",99999);
        System.out.printf(" Your First Name is :%s %n",secondEmployee.getFirstName());
        System.out.printf(" Your Last Name is :%s %n",secondEmployee.getLastName());
        System.out.printf(" Your Salary is :%.2f%n",secondEmployee.getMonthlySalary());
        System.out.printf(" Your yearly Salary is :%.2f%n",secondEmployee.yearlySalary());
        System.out.printf(" Yearly Salary 10 percent  Bonus :%.2f%n:",secondEmployee.bonus());
        

//        System.out.println(" Enter your new salary");
//          double newSalary=input.nextDouble();
//         
//          if (newSalary>0){
//                  firstEmployee.setMonthlySalary(newSalary);
//         
//                   System.out.printf(" Your new salary is : %s ",firstEmployee.getMonthlySalary());
//          }else{
//              System.out.println(" Cant set Negative Salary");
//              
//          }
          
    }
}
