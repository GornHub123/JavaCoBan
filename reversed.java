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
public class reversed {
    public static void main(String args[]){  
        Scanner scanner = new Scanner(System.in); 
        int d;
        double n,i = 1,s = 0;
        System.out.println("Input an integer :");
        n = scanner.nextDouble();
        while (n >= 1){			           
            d = (int) (n % 10);	            			
            s = s + d/i;				           
            n /= 10;
            i= i*10;
        }
        s = s*i/10;
        System.out.println(s);
    }
}
