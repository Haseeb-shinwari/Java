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
public class Crow extends Animal{
    public Crow(String name) {
        setName(name);
        setColor("black");
    }
    @Override
     public String toString() {
        return super.toString() + "I sound Craw! ";
    }
}
