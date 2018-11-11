
package DateClass;


public class Date {
    
    private int day;
    private int month;
    private int  year;
    
   public Date(int month, int day, int year){
       
       if( day>0 && day<=31){
           
           this.day=day;
           
       }
       if(month>0 && month<=12){
           
           this.month=month;
           
       }
       if(year>0 && (year>=1998 &&  year<=2018)){
           
           this.year=year;
           
       }
       
   }
   public void setDay(int day){
         if( day>0 && day<31){
           
           this.day=day;
           
       }
   }
   public void setMonth(int month){
       if(month>0 && month<12){
           
           this.month=month;
           
       }
   }
   public void setYear(int year){
       
              if(year>0 && (year>=1998 &&  year<=2018)){
           
           this.year=year;
           
       }
              
   }
   public int getDay(){
       
       return day;
   }
   public int getMonth(){
       
       return month;
       
   }
   public int getYear(){
       
       return year;
       
   }
    public void displayDate(){
        
        
        System.out.printf(" Date is  Month/Day/year : %d/%d/%d  %n",month,day,year);
        
        
    }
    
}
