/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author haseeb
 */
public class Rectangle {
    
    private float length=1;
    private float  width=1;
    
    
    public void setLength(float length){
        
        if(length>0.0 && length<20.0){
            
            this.length=length;
        }
  
    }
    public void setWidth(float width){
        
        if(width>0.0 && width <20.0){
              this.width=width;
        }
    }
    
    public float getLength(){
        
        return length;
    }
    public float getWidth(){
        
        return width;
    }
    
    public float calculateArea(){
        
        float Area=length*width;
         
        return Area; 
                 
                 }
    public float  calculatePerimeter(){
        
        float perimeterOfRectangle=(2*length)+(2*width);
        
        return perimeterOfRectangle;
        
        
    }
    
    public String toString(){
        
        return String.format(" Area of Rectangle :%.2f %n Perimter of Rectangle %.2f %n",calculateArea() ,calculatePerimeter());
  
    }
    
    
    
    
}
