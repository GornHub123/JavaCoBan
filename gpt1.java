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
public class gpt1 {
    public static void main(String[] args) {
        double a, b;
        double nghiem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
	a = scanner.nextDouble();
	System.out.println("b = ");
	b = scanner.nextDouble();
        System.out.println("Phuong trinh : "+a+"x + "+b+" = 0");
        if (a == 0) {
            if (bNumber == 0) {
                System.out.println("Phuong trinh co vo so nghem.");
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
	} else {
		nghiem = -b / a;
		System.out.println("Phuong trinh co nghiem = " + nghiem + ".");
	}
    }
}
