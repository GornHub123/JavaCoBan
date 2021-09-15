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
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        Random rd = new Random();
        int n1 = rd.nextInt(10);
        int n2 = rd.nextInt(10);
        int t1;
        int t;
        if(n1 >= n2)
        {
            t = n1 - n2;
            System.out.println("What is "+n1+" - "+n2);
            System.out.println("Type your answer :");
            t1 = scanner.nextInt();
            if ( t1 == t)
            {
                System.out.println("Your answer is correrct");
            } else 
            {
                System.out.println("Your answer is wrong");
            }           
        }else
        {
            t = n2 - n1;
            System.out.println("What is "+n2+" - "+n1);
            System.out.println("Type your answer :");
            t1 = scanner.nextInt();
            if ( t1 == t)
            {
                System.out.println("Your answer is correrct");
            } else 
            {
                System.out.println("Your answer is wrong");
            }   
        }        
    }
}
