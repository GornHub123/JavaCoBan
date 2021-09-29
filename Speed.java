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
public class Speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int me,h,m,s,sa;
        double mps,kmph,mileph;
        System.out.println("Input distance in meters:");
        me = scanner.nextInt();
        System.out.println("Input hour:");
        h = scanner.nextInt();
        System.out.println("Input minutes:");
        m = scanner.nextInt();
        System.out.println("Input seconds:");
        s = scanner.nextInt();
        sa = h*60*60 + m*60 + s;
        mps = (double) me / sa;
        System.out.println("Your speed in meters/second is "+mps);
        kmph = (double) mps*3.6;
        System.out.println("Your speed in km/h is "+kmph);      
        mileph = (double) mps*3.6*0.621371192;
        System.out.println("Your speed in miles/h is "+mileph);
    }
}
