/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BasePlusCommissionEmployee;

import CommissionEmployee.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    BasePlusCommissionEmployee(String firstName,String lastName,double socialSecurityNumber,double grossSales,double CommissionRate,double baseSalary)
    {
          super(firstName,lastName,socialSecurityNumber,grossSales,CommissionRate);
          if(baseSalary<0.0){
              
              throw new IllegalArgumentException("Basae salay cant be negative ");
              
          }
          
          this.baseSalary=baseSalary;
          
    }

    public void setBaseSalary(double baseSalary) {
       if(baseSalary<0.0){
           
           throw new IllegalArgumentException(" Base salay cant be negative ");
       }
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double  earnings(){
        
        return baseSalary+(super.getCommissionRate()*super.getGrossSales());
    
    }

    public double getBaseSalary() {
        return baseSalary;
    }
    
   
    public String toString(){
        
        return String.format("%s%n Base Salary is %.2f", super.toString(),getBaseSalary());
    
    }
    
    
    
    
}
