
package Quiz_1;


public class Product  {
 
    private String  name;
    private double price;
    private Date date;
    private double discountPrice;
    
    
    public Product (Date date ,String name ,double price,double percent ){
        
        this.date=date;
        this.name=name;
        this.price=price;
        
        discountPrice=price*percent;
    }
   
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        
        return name;
    }
    public void setPrice(double price )
    {
        this.price=price;
        
    }    
    public double getPrice(){
        
        return price;
    }
    public void setDate(Date date){
        this.date=date;
        
    }
    public void setDiscountedPrice(double percent){
        
           discountPrice=price*percent;
           
        
    }
    public double  getDiscountPrice(){
        return  discountPrice;
    }
    public Date getDate(){
        
        return date;
         }
    public String toString (){
        
        return String.format(" %s%n Name is : %s%n Price is %.2f %n Discount :%.2f ",date,name,price,getDiscountPrice());
        
    }
    
}
