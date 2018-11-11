/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMICalculator;

import java.util.Scanner;

/**
 *
 * @author haseeb
 */
public class BmiTest {
  
    public static void main(String [] args ){
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter Your Weight In Kg ");
        double  weightInKg=input.nextDouble();
        System.out.println("Enter Your Height In Meters ");
        double heightInMeter=input.nextDouble();
        
        Bmi obj=new Bmi(heightInMeter,weightInKg);
        obj.calculateBmi();
        
        
        
    }
}
