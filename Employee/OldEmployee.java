/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class OldEmployee {
    
   private String name;
   private int age ;
   private String experience;
   
   public OldEmployee(String name,int age,String experience){
       
       this.name=name;
       this.experience=experience;
       
       
   }
   
   public String toString(){
       
       return String.format("Name :%s %n Experience %s %n Age:%d",name,experience,age);
       
   }
    
}
