/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceClass;

/**
 *
 * @author haseeb
 */
public class InVoiceClass {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    
    public  InVoiceClass(String partNumber,String partDescription,int quantity,double pricePerItem){
    this.partDescription=partDescription;    
    this.partNumber=partNumber;
    this.pricePerItem=pricePerItem;
    this.quantity=quantity;
    
    
    }
    public void setPartNumer(String partNumber){
        this.partNumber=partNumber;
    }
    public void setPartDescription(String partDescription ){
        
        this.partDescription=partDescription;
        
    }
    public void setQuantity(int quantity){
        if(quantity<0){
            
            quantity=0;
            
             this.quantity=quantity;
        }
        else{ this.quantity=quantity;
        }
        }
        
    
    public void setPricePerItem(double pricePerItem){
       
        if(pricePerItem <0){
         
            pricePerItem=0.0;
            
             this.pricePerItem=pricePerItem;
        }else{
            
                 this.pricePerItem=pricePerItem;
        }
       
        
    }
    public String getPartDescription(){
        
        return partDescription;
    }
    public String getPartNumber(){
        
        return partNumber;
        
    }
    public double getPricePerItem(){
        
        return pricePerItem;
    }
    public int getQuantity(){
        
        return quantity;
        
    }
   public double getInVoiceAmount(){
       double inVoiceAmount=this.quantity*this.pricePerItem  ;
       
       return inVoiceAmount;
       
       
    }
    
}
