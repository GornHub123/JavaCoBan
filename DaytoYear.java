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
public class DaytoYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int d = 0,y = 0;
        double m,m1;
        System.out.println("Input the number of minutes:");
        m = scanner.nextDouble();
        m1 = m;
        m = m /(60*24);
        y = (int) m / 365;
        d = (int) m % 365;
        System.out.println(m1+" minutes is approximately "+y+" years and "+d+" days");
    }
}
