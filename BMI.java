/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double bmi;
        System.out.println("Enter your Body Mass Index (BMI) :");
        bmi = scanner.nextDouble();
        if (bmi < 18.5)
        {
            System.out.println("Your body is UNDERWEIGHT");
        }else if (bmi >= 18.5 && bmi < 25)
        {
            System.out.println("Your body is NORMAL");
        }else if (bmi >= 25 && bmi < 30)
        {
            System.out.println("Your body is OVERWEIGHT");
        }else if (bmi >= 30)
        {
            System.out.println("Your body is OBESE");
        }
    }
}
