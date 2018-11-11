/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMICalculator;

/**
 *
 * @author haseeb
 */
public class Bmi {
    
    private double weightInKg;
    private double  heightInMeter;
    public Bmi(double heightInMeter,double weightInKg){
        
        this.heightInMeter=heightInMeter;
        this.weightInKg=weightInKg;
        
    }
    public void setHeight(double height){
        
        this.heightInMeter=heightInMeter;
        
    }
    public void setWeight(double weightInKg)
    {
        this.weightInKg=weightInKg;
    }
    public double getWeight(){
        
        return weightInKg;
    }
    public double getHeight(){
        
        return heightInMeter;
    }
    
    public void calculateBmi(){
        
        double bmi= weightInKg/(heightInMeter*heightInMeter);
        System.out.printf("Your BMI is %.1f %n",bmi);
        System.out.println("BMI VALUES");
        if(bmi<18.5){
        System.out.println("Underweight : Less than 18.5");
        }else if(bmi >=18.5 && bmi <=24.9){
        System.out.println("Normal : between 18.5 and 24.9 ");
        }else if(bmi >=25 && bmi<=29.9){
        System.out.println("Overweight : betweeen 25 and 29.9");}
        else if(bmi>=30){
        System.out.println("obese : 30 or greater ");
        }
        
    }
            
            }
