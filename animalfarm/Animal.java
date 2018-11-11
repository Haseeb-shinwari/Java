

package animalfarm;

public class Animal extends Object {
    private String name;
    private String color;
    //public Animal(String name, String color)
    //{
      //  this.name = name;
      //  this. color = color;
    //}
    public void setName(String name) {
        this.name = name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getName() {
        return name;        
    }
    
    public String getColor() {
        return color;
    }
    
    @Override
    public String toString() {
        return "Hi, my name is " + name +". I'm " + color + ".";
    }
}
