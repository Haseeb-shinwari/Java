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
public class Date {
    private int day;
    private int monthInt;
    private String monthString;
    private String months[]={"jan","feb","march","april","may","june","july","augest","seprt","oct","sep","nov","dec"};
    private int year;
    
    
    Date(int day ,int month,int year){
       this.day=day;
        this.monthInt=month;
        this.year=year;
        System.out.printf("%d/%d/%d%n",day,month,year);   
    }
    
    
    Date(String month,int day,int  year){
     this.day=day;
     this.monthString=month;          
     this.year=year;
     System.out.printf("%s  %d, %d%n",month,day,year);   
     
     
    }
    Date(int day, int year){
        
       this.day=day;
       this.year=year;       
       System.out.printf("%d  %d%n",day,year);   
     
    }
    
 
    
}
