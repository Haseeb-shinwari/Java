/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *
 * @author haseeb
 */
public class TestAnimal {
    
    
    public static void main(String [] args )
    {
        Animal animal=new Animal();
        Animal bird1=new Bird();
         System.out.println(bird1.move());
         
         Animal[] animal1=new  Animal[3];
         
         for(Animal currentAnimal: animal1){
             System.out.println(currentAnimal.move());
         }
    }
    
}
