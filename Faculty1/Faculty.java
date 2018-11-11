/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class Faculty {
  
    private String name;
    private Course course1;
    private department dep1;
    
    public Faculty(String name,Course course1,department dep1){
        this.dep1=dep1;
        
        this.name=name;
        this.course1=course1;
        
    }

    public department getDep1() {
        return dep1;
    }

    public void setDep1(department dep1) {
        this.dep1 = dep1;
    }
    

    public Course getCourse1() {
        return course1;
    }

    public String getName() {
        return name;
    }

    public void setCourse1(Course course1) {
        this.course1 = course1;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        
        return String.format("name of course is : %s%n course detail : %s%n department detail: %s%n",getName(),getCourse1(),getDep1() );
        
    }

    
}
