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
public class EmployeeClass {
    
    private String firstName;
    private String lastName;
    private  double  monthlySalary;
    
    public EmployeeClass(String firstName,String lastName,double monthlySalary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.monthlySalary=monthlySalary;
        
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
        
    }
    public void setLastName(String lastName){
        
        this.lastName=lastName;
        
    }
    public void setMonthlySalary(double monthlySalary){
        
      if(monthlySalary >0){  this.monthlySalary=monthlySalary;
      }
      
    }
    public String getFirstName(){
        
        return firstName;
        
    }
    public String getLastName(){
        
        return lastName;
    }
    public double getMonthlySalary(){
        
        return monthlySalary;
        
    }
    public double yearlySalary(){
        
        return monthlySalary*12;
        
    }
    public double bonus(){
           
      

       double  month=0.1*monthlySalary;
        double tenthPercent=month+12;     
          return tenthPercent;
        
    }
    
    
    
}
