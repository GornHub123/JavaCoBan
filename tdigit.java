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
public class tdigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int s = 0;
        double n;
        System.out.println("Input an integer :");
        n = scanner.nextDouble();
        while (n >= 1){			           
            n /= 10;
            s++;
        }
        System.out.println(s);
    }
}
