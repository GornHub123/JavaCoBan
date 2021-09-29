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
public class LeapY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int y;       
        System.out.println("Input the year:");
        y = scanner.nextInt();
        if ((y%4) ==0)
        {
            System.out.println(y+" is a leap year");
        } else
        {
            System.out.println(y+"is NOT a leap year");
        }
        
    }
}
