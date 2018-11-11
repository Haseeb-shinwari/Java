
package Quiz_1;


public class Apparel extends Product {

    private String seasonName;
    private double seasonDiscount;
    private int seasonDiscountPercent;
    
    public Apparel(Date date,String name ,double price,double percent,String seasonName,double seasonDiscountPercent ){
        
        super(date,name,price,percent);
        this.seasonName=seasonName;
        this.seasonDiscount=super.getPrice()*seasonDiscountPercent;
        
        
    }
    public String  getSeasonName(){
        
        return seasonName;
    }
    public void seasonDiscount(){
            
          this.seasonDiscount=super.getPrice()*seasonDiscountPercent;
          
      }
    public double getSeasonDiscount(){
        return seasonDiscount;
        
    }
    public double  overAllDiscount(){
        
        return super.getDiscountPrice()+getSeasonDiscount();
        
    }
    public String toString(){
        return String.format("%s%n Season name :%s%n Season Discount :%.2f%n Overall discount is %.2f%n", super.toString(),getSeasonName(),getSeasonDiscount(),overAllDiscount());
    }
    
}
