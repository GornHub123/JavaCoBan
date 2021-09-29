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
public class pon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n;
        System.out.println("Enter your Number :");
        n = scanner.nextInt();
        if (n >= 0)
        {
            System.out.println("Number is positive");
        } else
        {
            System.out.println("Number is negative");
        }
    }
}
