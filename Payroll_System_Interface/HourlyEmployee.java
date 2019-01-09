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
public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    
    //constructor
    public HourlyEmployee(String firstName, String lastName, String SSN, double wage, double hours)
    {
        super(firstName, lastName, SSN);
        setWage(wage);
        setHours(hours);
    }
    public void setWage(double wage)
    {
        if(wage < 0.0)
            throw new IllegalArgumentException("Hourly wage must be >= 0");
        
        this.wage = wage;
    }
    
    public double getWage()
    {
        return wage;
    }
    
    public void setHours(double hours)
    {
        if((hours < 0.0) || (hours > 168.0))//validate hours
            throw new IllegalArgumentException("Invalid value for hours");
        
        this.hours = hours;
    }
    public double getHours()
    {
        return hours;
    }
    @Override
    public double getPaymentAmount()
    {
        if(getHours() <= 40)// no overtime
            return getWage()*getHours();
        else
            return 40 * getWage() + (getHours() - 40)* getWage()*1.5;
    }
    @Override
    public String toString()
    {
        return String.format("Hourly employee: %s%n%s: PKR%,.2f; %s: %,.2f", super.toString(), "Hourly Wage", getWage(),
                "Hours Worked", getHours());
    }
}
