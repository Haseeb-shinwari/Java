package CommissionEmployee ;
import Employee.Employee;
public class CommissionEmployee extends Employee{
    
    private double grossSales;
    private double commissionRate;
    
   public  CommissionEmployee(String firstName,String lastName,double socialSecurityNumber,double commissionRate,double grossSales){
       
       super(firstName,lastName,socialSecurityNumber);
       
       if(commissionRate<=0.0 && commissionRate>=1.0)
       {
           throw new IllegalArgumentException(" Commison Rate must be between 0.0 and 1.0");
       }
       
       if(grossSales<0.0){
            throw new IllegalArgumentException(" gross sales cant be negative ");
    }
       
      this.commissionRate=commissionRate;
      this.grossSales=grossSales;
      
   }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        
        if(commissionRate<=0.0 && commissionRate >=1.0){
            
            throw new IllegalArgumentException(" Commission Rate must be between Commission Rate");
        }
        
        this.commissionRate = commissionRate;
        
        
    }

    public void setGrossSales(double grossSales) {
      if(grossSales<0.0){
          
          throw new IllegalArgumentException(" Gross sales cant be negative ");
      }
        this.grossSales = grossSales;
    }
      public double earnings(){
       
       return grossSales*commissionRate;
       
   }
   

 public String toString(){
     
     return String.format("%s %nCommission Rate  is %.2f %n GrossSales is %.2f %n Earnings is %.2f",super.toString(),getCommissionRate(),getGrossSales(),earnings());

 } 
   
   
}
