/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComplexNumbers;

/**
 *
 * @author haseeb
 */
public class Complex {
   
    public float realPart;
    public float imaginaryPart;
    private static Complex c3=new Complex();
    Complex(){}

    public static void  addTwoComplexNumber(float realPart,float maginaryPart){
      
      c3.realPart=realPart;
      c3.imaginaryPart=maginaryPart;
      
        
    }
   
    public void subtractTwoComplexNumber(float realPart,float maginaryPart){
  
        c3.realPart+=realPart;
        c3.imaginaryPart +=maginaryPart;
  
    }
    
    public String toString(){
        
        return String.format(" Real Part : %.2f %n Imaginary %.2f", c3.realPart,c3.imaginaryPart);
        
    }
   
    
}