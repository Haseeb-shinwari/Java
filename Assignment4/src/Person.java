

public abstract class Person {

    private String name;
    private String address;
    private double phoneNumber;
    private String emailAddress;
    
    public Person(String name,String address,double phoneNumber,String emailAddress){   
      this.name=name;
      this.address=address;
      this.phoneNumber=phoneNumber;
      this.emailAddress=emailAddress;
      
    }
    
    public String toString(){
      
    return String.format(" Name is : %s%n Address is %s%n Phone Number is %s%n Email Address is %s%n");
    
    
}
}