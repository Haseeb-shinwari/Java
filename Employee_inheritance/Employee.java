
package Employee;


public class Employee {
    private  String firstName ,lastName;
    private double socialSecurityNumber;
    
    public Employee(String firstName,String lastName,double socialSecurityNumber){
        
         this.firstName=firstName;
         this.lastName=lastName;
        this.socialSecurityNumber=socialSecurityNumber;
   
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
        
    }
    public void setSocialSecurityNumber(double  socialSecurityNumber){
        this.socialSecurityNumber=socialSecurityNumber;
    }
    public String getFirstName(){
        
        return firstName;
    }
    public String getLastName(){
        
        return lastName;
    }
    public double getSocialSecurityNumber(){
        
        return socialSecurityNumber;
        
    }
    
    public String toString(){
        
        return String.format(" First Name is : %s%n LastName is :%s%n Social Security Number is %f%n", firstName,lastName,socialSecurityNumber);
    }
    
}
