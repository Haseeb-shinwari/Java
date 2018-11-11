/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class NewEmployee {
    
    private String   name;
    int age;
    
    public NewEmployee(String name,int age){
        
       this.name=name;
       this.age=age;
       
    }
    
    public String toString(){
        
        return String.format("Name of Employee is: %s%n Age of Employee is: %d",name,age);
    }
}
