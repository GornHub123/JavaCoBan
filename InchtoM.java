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
public class InchtoM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double i;
        System.out.println("Input a value for inch:");
        i = scanner.nextDouble();
        double m = i*0.0254;
        System.out.println(i+" inch is "+m+" meters");
    }    
}
