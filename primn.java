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
public class primn {
    public static void main (String[] args)
   {	
       Scanner scanner = new Scanner(System.in); 
       int s = 0;
       int n;
       System.out.println("Input an integer :");
       n = scanner.nextInt();
       int i =0;
       int num =0;
       String  primeNumbers = "";

       for (i = 1; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println(n+"Prime numbers from 1 to "+n+" are :");
       System.out.println(primeNumbers);
   }
}
