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
public class SalariedEmployee extends Employee {
    private double weeklySalary;
    
    //constructor
    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary)
    {
        super(firstName, lastName, SSN);
        setWeeklySalary(weeklySalary);
    }
    public void setWeeklySalary(double weeklySalary)
    {
        if(weeklySalary < 0.0)
            throw new IllegalArgumentException("Weekly salary must be more than 0.0");
        
        this.weeklySalary = weeklySalary;
    }
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    @Override
    public double getPaymentAmount()
    {
        return getWeeklySalary();
    }
    @Override
    public String toString()
    {
        return String.format("Salaried Employee: %s%n%s: PKR%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }
}
