/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animalfarm;

/**
 *
 * @author Ali
 */
public class AnimalFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat cat = new Cat("pisho","grey","meow");
        Dog dog = new Dog("tommy");
        Crow crow = new Crow("kargha");        
       // Animal animal;
        
     //   if(Math.random() < 0.5) {
       //     animal = crow;
       // } else {
         //   animal = dog;
        //}
        Animal dog2 = new Dog("dog");
        // There are three implementations of the toString() method.
        // 1st: in the Object class
        // 2nd: in the Animal class
        // 3rd: in the Crow class
        
        // Which toString() method will be invoked?
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(crow);
       System.out.println(dog2);
        
        // It is impossible to know which toString()
        // will be called below. There are two options:
        // either the one in Animal, or the one in Crow.
        // Depending on what type of an object hayvan points to,
        // the method to invoke will be determined.
        // Because the assignment to animal is done randomly,
        // we cannot know which toString() will be called.
        // It is determined during execution (i.e. at runtime)
 //       System.out.println(animal);
    }
    
}
