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
public class Fact {
    public static void main(String args[]){  
        Scanner scanner = new Scanner(System.in); 
        int n;
        System.out.println("Input an integer :");
        n = scanner.nextInt();
        int i,fact=1;  
        for(i=1;i<=n;i++)
        {    
            fact=fact*i;    
        }    
     System.out.println("Factorial of "+n+" is: "+fact);    
    }  
}  

