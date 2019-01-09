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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee(
            String firstName, String lastName, String SSN, double sales, double commission, double baseSalary){
        super(firstName, lastName, SSN, sales, commission);
        setBaseSalary(baseSalary);
    }
public void setBaseSalary(double base)
{
    if(base < 0.0)
        throw new IllegalArgumentException("Base salary must be more than zero");
    this.baseSalary = base;
}
public double getBaseSalary()
{
    return this.baseSalary;
}

@Override
public double getPaymentAmount()
{
    return getBaseSalary() + super.getPaymentAmount();
}
@Override
public String toString()
{
    return String.format("%s %s; %s: PKR%,.2f", "base-salaried", super.toString(), "base salary", getBaseSalary());
}
}


