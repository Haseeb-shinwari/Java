/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package payrollsystempackage;

/**
 *
 * @author Ali
 */
public class PayrollSystemTest {
    public static void main(String[] args)
    {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", 8000.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 500.50, 40);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333", 1000000, 0.06);
        // instantiate CommissionEmployee object
      BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee( 
         "Sue", "Jones", "222-22-2222", 100000, .04, 5000 );
      Employee[] employees = new Employee[4];
      
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = basePlusCommissionEmployee;
      
      for (Employee currentEmployee : employees)
      {
          System.out.println(currentEmployee);
          
          if (currentEmployee instanceof BasePlusCommissionEmployee)
          {
              BasePlusCommissionEmployee employee =
                      (BasePlusCommissionEmployee) currentEmployee;
              
              employee.setBaseSalary(1.10*employee.getBaseSalary());
              
              System.out.printf("New Base Salary with 10%% increase is: PKR%,.2f%n", employee.getBaseSalary());
          }//end if
          System.out.printf("Earned PKR%,.2f%n%n", currentEmployee.earnings());
      }//end for
      
      for (int j = 0; j < employees.length; j++)
          System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
    }//end main
      /*
      // get commission employee data
      System.out.println( 
         "Employee information obtained by get methods: \n" );
      System.out.printf( "%s %s\n", "First name is",
         employee.getFirstName() );
      System.out.printf( "%s %s\n", "Last name is", 
         employee.getLastName() );
      System.out.printf( "%s %s\n", "Social security number is", 
         employee.getSocialSecurityNumber() );
      System.out.printf( "%s %.2f\n", "Gross sales is", 
         employee.getGrossSales() );
      System.out.printf( "%s %.2f\n", "Commission rate is",
         employee.getCommissionRate() );
      System.out.printf("%s %.2f%n", "Salary: ", employee.getBaseSalary());
      
      System.out.printf("%s %.2f%n", "Earnings: ", employee.earnings());

      employee.setGrossSales( 50000 ); // set gross sales
      employee.setCommissionRate( .1 ); // set commission rate
      employee.setBaseSalary(1000);
      System.out.printf( "\n%s:\n\n%s\n", 
         "Updated employee information obtained by toString", employee );
    }
    */
}//end class
