
package Employee;

public class HourlyEmployee extends Employee {

   private double  hourlyWage;
   private double  hoursWorked;
   
   public  HourlyEmployee(String firstName,String lastName,double socialSecurityNumber,double hourlyWage,double hoursWorked){
       
       super(firstName,lastName,socialSecurityNumber);
       this.hourlyWage=hourlyWage;
       this.hoursWorked=hoursWorked;
       
   }
   
   public void setHourWage(double hourWage){
        this.hourlyWage=hourlyWage;  
    
  }
   public void setHoursWage(double hoursWorked){
       
       this.hoursWorked=hoursWorked;
   }
   public double  getHourWage(){
       
       return hourlyWage;
   }
   public double getHourlyWorked(){
       
       return hoursWorked;
   }
   public String toString(){
       
       return String.format("%s%n Hourly Wage is %.2f%n HoursWorked is %.2f%n", super.toString(),getHourWage(),getHourlyWorked());
   }
   
   
   
}