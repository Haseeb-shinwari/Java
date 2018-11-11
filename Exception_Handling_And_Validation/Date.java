/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DateCalss;

/**
 *
 * @author haseeb
 */
public class Date {

private int day;
private int month;
private int year;
private static final int[] daysPerMonth={0,31,28,31,30,31,30,31,31,30,31,30,31};
public Date(int day ,int month,int year){
    if(month <1 || month >12){
        throw new IllegalArgumentException("month"+month+" should be between 1 --12");
    }
    if(day<=0 || day >daysPerMonth[month] && !(month==2 && day==29) ){
        throw new IllegalArgumentException(" You enter invalid day ");
    }
    if((month==2 && day==29) && !(year % 400==0) || (year % 4 ==0  && year % 100 !=0)){

     throw new IllegalArgumentException("in correct day or month");

}
    this.day=day;
    this.month=month;
    this.year=year;
    
    
}
          public String  toString(){
        
        return String.format(" %d/%d/%d", day,month,year);
        
    }
    
}

    
