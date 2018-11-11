
package HourlyEmployees;
import Employee.Employee;
public class HourlyEmployees extends Employee{
    
    private int  hourlyWage;
   private int  hoursWorked;
   
   public  HourlyEmployees(String firstName,String lastName,double socialSecurityNumber,int hourWage,int hoursWage){
       
       super(firstName,lastName,socialSecurityNumber);
             if(hourlyWage <0){
           throw new IllegalArgumentException(" Hourly Wage cant be negative");
          }
       this.hourlyWage=hourlyWage;
       if(hoursWorked <0 && hoursWorked >168){
           throw new IllegalArgumentException("  Hours Work must be Between 0 and 168");
       }
       this.hoursWorked=hoursWorked;
       
   }
   
   public void setHourWage(int hourWage){
   
           if(hoursWorked <0 && hoursWorked >168){
           throw new IllegalArgumentException("  Hours Work must be Between 0 and 168");
       }
       this.hourlyWage=hourlyWage;  
    
  }
   public void setHoursWage(int hoursWorked){
       
       if(hourlyWage <0){
           throw new IllegalArgumentException(" Hourly Wage cant be negative");
   }
          this.hoursWorked=hoursWorked;
   }
   public int  getHourWage(){
       
       return hourlyWage;
   }
   public int getHourlyWorked(){
       
       return hoursWorked;
   }
   public double earnings(){
       
       return hourlyWage* hoursWorked;
   }
   
   public String toString(){
       
       return String.format("%s%n Hourly Wage is %d%n HoursWorked is %d%n Earning is %.2f", super.toString(),getHourWage(),getHourlyWorked(),earnings());
   }
   
}
