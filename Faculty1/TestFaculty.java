/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haseeb
 */
public class TestFaculty {

public static void main(String [] args ){
    
    department ob1=new department("IT ",20);
   Course cs=new Course("CS213",12);
   Faculty faculty1=new Faculty("OOP",cs,ob1);
    System.out.println(faculty1);

}    
}
