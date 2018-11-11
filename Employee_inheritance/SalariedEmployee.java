
package Employee;

public class SalariedEmployee extends Employee {

    private double weeklySalary;
   
    public SalariedEmployee(String firstName,String lastName,double socialSecurityNumber,double weeklySalary){
        
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary=weeklySalary;
        
        
    }
    
    public void setWeeklySalary(double weeklySalary){
        
        this.weeklySalary=weeklySalary;
        
    }
    public double getWeeklySalary(){
        
        return weeklySalary;
    }
    
    public String toString(){
        
        return String.format("%s%n Weekly salary is %.2f", super.toString(),getWeeklySalary());
        
    }
    
    
}
