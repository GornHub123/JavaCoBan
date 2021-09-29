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
public class day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n,d;
        System.out.println("Enter your Number :");
        n = scanner.nextInt(); 
        d = n % 7;
        switch(d)
        {
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 0:System.out.println("Sunday");break;
            default:System.out.println("Error");break;
        }
    }
}
