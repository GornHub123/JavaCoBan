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
public class Fibo {
    public static void main (String[] args)
   {	
       int n1 = 0,n2 = 1,n;
       System.out.print("0 1 ");
       for (int i = 3;i <= 10;i++)
       {
           n = n2;
           n2 = n1 + n2;
           n1 = n;
           System.out.print(n2+" ");
       }
   }
}
