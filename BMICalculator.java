
package com.mycompany.bmicalculator;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("\n========[ BMI CALCULATOR ]========");
        System.out.println("1. Imperial System");
        System.out.println("2. Metric System");
        System.out.print("Enter Your Choice ( 1 | 2 ): ");
        int option = scan.nextInt();
        
        if (option == 1){
            
            System.out.println("\n========[ IMPERIAL SYSTEM ]======");
            
            System.out.print("\nEnter Your Weight (in pounds): ");
            double weight = scan.nextDouble();
            
            System.out.print("Enter Your Height (in Inches): ");
            double height = scan.nextDouble();
            
            final int formula = 703;
            
            double BMI = formula * (weight / (height * height));
            
            System.out.println("\n***********************************");
            System.out.printf("YOUR BMI: %.3f", BMI);
            System.out.println("\n***********************************");
            
            
            
        }else if (option == 2){
            
            System.out.println("\n========[ METRIC SYSTEM ]======");
            
            System.out.print("\nEnter Your Weight (in Kilogram): ");
            double weight = scan.nextDouble();
            
            System.out.print("Enter Your Height (in Meters)  : ");
            double height = scan.nextDouble();
            
            double BMI = weight / (height * height);
            
            System.out.println("\n***********************************");
            System.out.printf("YOUR BMI: %.3f", BMI);
            System.out.println("\n***********************************");
            
            
        }else {
            System.out.println("\nINVALID OPTION! ! !");
        }
        
    }
}
