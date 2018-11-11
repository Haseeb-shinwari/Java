/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class Employee {
    
   private String companyName;
   private  NewEmployee newEmp;
   private  OldEmployee oldEmp;
    
   public  Employee(String companyName,NewEmployee newEmp,OldEmployee oldEmp){
       
    this.newEmp=newEmp;
              this.oldEmp=oldEmp;
       if(newEmp.age<=30){
        
           this.companyName="new company";
       }
       else if(newEmp.age>30){
                 
    
           this.companyName="old company";
           
       }}
       
       public  String toString(){
           
           return String.format("name i am tired %s", companyName);
       }
       
       
       
   }
    
    

