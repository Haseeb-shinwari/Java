/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class department {
    
    private String deprtName;
    private int departRooms;
    
    public department(String name,int roomNo  ){

       this.deprtName=name;
               this.departRooms=roomNo;
   
    
    }

    public int getDepartRooms() {
        return departRooms;
    }

    public String getDeprtName() {
        return deprtName;
    }

    public void setDepartRooms(int departRooms) {
        this.departRooms = departRooms;
    }

    public void setDeprtName(String deprtName) {
        this.deprtName = deprtName;
    }

    @Override
    public String toString() {
        return String.format("name of dep is %s%n  room in deparment %s%n",getDeprtName(),getDepartRooms()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
        
    
    
            
          