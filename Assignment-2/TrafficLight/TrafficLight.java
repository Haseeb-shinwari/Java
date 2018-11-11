/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrafficLight;

// note
// enum constructor is private must 
// enum constant can also take two argument one for value and second for discription;
public enum TrafficLight {
    
// whole class will be execte for one call 
 // these varaible are public static final and cannot be changed 
    RED("RED    : Stop" ,"  1 minute "),GREEN("GREEN  : Go","    0 second"), YELLOW("YELLOW : Stop if neccesary "," 5 second");
  
 
    private final String description;
    private final String time;
    TrafficLight(String description,String time){
       
        // these argument are intailize with constant given above ;
         
        this.description=description;
        this.time=time;
        // assigning constant argument to class variable 
        
    }
    
    public String  getDescription(){
    
      return description;
    }
    public String getTime(){
        
         return time;      
    }
   
}