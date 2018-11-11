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
public class CommissionEmployee extends Employee {
//    private String firstName;
//    private String lastName;
    
    private double commissionRate;
    private double grossSales;
    
    public CommissionEmployee(String firstName, String lastName, String SSN, double sales, double commission)
    {
//        this.firstName = firstName;
//        this.lastName = lastName;
        super(firstName, lastName, SSN);
        setGrossSales(sales);
        setCommissionRate(commission);
    }
    

   public void setGrossSales(double sales)
   {
       if(sales >= 0.0)
       {
           this.grossSales = sales;
       }
       else
           throw new IllegalArgumentException("Sales must be greater than 0");
   }
   
   public double getGrossSales()
   {
       return this.grossSales;
   }
   public void setCommissionRate(double commission)
   {
       if(commission <= 0.0 || commission >= 1.0)
           throw new IllegalArgumentException("Invalid commission rate");
       else
           this.commissionRate = commission;
   }
   
   public double getCommissionRate()
   {
       return this.commissionRate;
   }
   @Override
    public double earnings()
    {
        return getGrossSales()*getCommissionRate();
    }
    
    @Override //overrides method from the Object class
    public String toString()
    {
        return String.format( "%s: %s%n%s: PKR%,.2f; %s: %.2f", 
         "commission employee", super.toString(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
    }
}
