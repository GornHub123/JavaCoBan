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
public class FahtoCel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double f;
        System.out.println("Input a degree in Fahrenheit:");
        f = scanner.nextDouble();
        double c = (double) 5 / 9 * (f - 32);
        System.out.println(f+" degree Fahrenheit is equal to "+c+" in Celsius");
    }    
}
