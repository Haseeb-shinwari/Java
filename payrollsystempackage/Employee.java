package payrollsystempackage;

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
  // private Date birthDate;
  // private Date hireDate;

   // constructor to initialize name, birth date and hire date
   public Employee(String firstName, String lastName, String SSN) //Date birthDate, Date hireDate)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.socialSecurityNumber = SSN;
    //  this.birthDate = birthDate;
    //  this.hireDate = hireDate;
   } 

    public void setFirstName( String first )
   {
      firstName = first; // should validate
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last; // should validate
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber
   // convert Employee to String format
   
   @Override
   public String toString()
   {
      return String.format("%s, %s  SSN: %s%n", 
         getLastName(), getFirstName(), getSocialSecurityNumber());
   }
   
   public abstract double earnings();
} // end class Employee
