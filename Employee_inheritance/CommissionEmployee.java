
package Employee;


public class CommissionEmployee extends Employee{
    // with String we use final 
    // with int we const
   
 private double grossSales; // gross weekly sales
 private double commissionRate; // commission percentage


public CommissionEmployee(String firstName, String lastName,double socialSecurityNumber,double grossSales, double commissionRate){
       
        super( firstName,lastName ,socialSecurityNumber);
         
        if(grossSales<0.0){
            
            throw new IllegalArgumentException(" Gross sales can not be less than 0.0");
        }
        
        if(commissionRate <=0.0 && commissionRate >=1.0){
            
            throw new IllegalArgumentException(" Commission Rate can not be less than 0.0 and not greter than 1.0");
            
        }
        
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;
        

}

   public void setCommissionRate(double commissionRate){
       
       if(commissionRate <=0.0 && commissionRate >=1.0){
           
           throw new IllegalArgumentException(" Commioss must be between 0.0 and 1.0");
   }
       this.commissionRate=commissionRate;
       
   }
   
   public double getCommissionRate(){
       
       return commissionRate;
       
   }
   public void setGrossSales(double grossSales){
       
       if(grossSales<0.0){
           
           throw new IllegalArgumentException(" Gross sales cant not be negative");
           
           
       }
       this.grossSales=grossSales;
   }
   
   public double earnings(){
       
       return grossSales*commissionRate;
       
   }
   
    public double getGrossSales()
    {
       return grossSales;
       
    }

 public String toString(){
     
     return String.format("%s %nCommission Rate  is %.2f %n GrossSales is %.2f %n Earnings is %.2f",super.toString(),getCommissionRate(),getGrossSales(),earnings());

 }

}