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
public class InvoiceTest {
    
    public static void main(String [] args){
        
        InVoiceClass obj1=new InVoiceClass("1","mother borad",-5,5000);
        System.out.println(obj1.getPartDescription());
        System.out.println(obj1.getInVoiceAmount());
        System.out.println(obj1.getPartNumber());
        System.out.println(obj1.getQuantity());
        
        
        
    }
}
