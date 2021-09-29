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
public class input5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n1,n2,n3,n4,n5,s; 
        double a;
        System.out.println("Input the 5 numbers");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        n3 = scanner.nextInt();
        n4 = scanner.nextInt();
        n5 = scanner.nextInt();
        s = n1+n2+n3+n4+n5;
        a = (double) s/5;
        System.out.println("The sum of 5 no is :"+s);
        System.out.println("The Average is"+a);
    }
}
