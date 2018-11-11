/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateClass;

/**
 *
 * @author haseeb
 */
public class DateTest {
    
    public static void main(String [] args){
         int month=12;
         int day=31;
         int year=1999;
         
        Date obj=new Date(month,day,year);
        
        obj.displayDate();
        
    }
    
}
