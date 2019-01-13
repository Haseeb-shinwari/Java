
public class Employee extends Person {
private double salary;
public Date date;

public Employee(String name,String  address,double phoneNumber,String emailAddress,double salary,Date date){
    
    super(name,address,phoneNumber,emailAddress);
    this.date=date;
    this.salary=salary;
    
}
public void setSalary(double salary){
    this.salary=salary;    
}

    public void setDate(Date date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDate() {
        return date;
    }

@Override
    public String toString(){
        
       return String.format("%s%n%s%n%s%n", super.toString(),getSalary(),getDate());
    }
}
