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
public class Cat extends Animal{
    private String sound;
    //private String name;
    //private String color;
    public Cat(String name, String color, String sound) {
        //super(name,color);
        //name = name;
        //color = color;
        this.sound = sound;
        setName(name);
        setColor(color);
        //this.name = name;
    }
    //setName(name);
}
