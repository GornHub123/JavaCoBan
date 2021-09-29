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
public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double n;
        System.out.println("Enter your Number :");
        n = scanner.nextDouble();
        if (n == 0)
        {
            System.out.println("Zero");
        } else if (n > 0 )
        {
            if ( n > 1 && n < 1000000)
            {
                System.out.println("Positive number");
            } else if (n < 1)
            {
                System.out.println("Small positive number");
            } else if (n > 1000000)
            {
                System.out.println("Large positive number");
            }
        } else if (n < 0 )
        {
            if ( n < -1 && n > -1000000)
            {
                System.out.println("Negative number");
            } else if (n > -1)
            {
                System.out.println("Small negative number");
            } else if (n < -1000000)
            {
                System.out.println("Large negative number");
            }
        }
    }
}
