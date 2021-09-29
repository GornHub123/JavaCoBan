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
public class TallDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int d,s = 0;
        double n1,n2;
        System.out.println("Input an integer between 0 and 1000:");
        n1 = scanner.nextDouble();
        n2 = n1;
        while (n2!=0){
            d = (int) (n2 % 10);	            			
            s = s + d;				           
            n2 /= 10;
        }
        System.out.println("The sum of all digits in "+n1 +" is "+s);
    }
}
