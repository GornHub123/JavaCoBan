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
public class gn3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n1,n2,n3;
        System.out.println("Enter your first Number :");
        n1 = scanner.nextInt();
        System.out.println("Enter your second Number :");
        n2 = scanner.nextInt();
        System.out.println("Enter your third Number :");
        n3 = scanner.nextInt();
        if ( n1 >= n2 && n1 >= n3)
        {
            System.out.println("The greatest: "+ n1);
        } else if (n2 >= n1 && n2 >= n3)
        {
            System.out.println("The greatest: "+ n2);
        } else if (n3 >= n2 && n3 >= n1)
        {
            System.out.println("The greatest: "+ n3);
        } 
    }
}
