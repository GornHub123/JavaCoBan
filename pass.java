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
public class pass {    
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        System.out.println("Username: ");                 
        String u = scan.next();   
        System.out.println("Password: ");  
        String p = scan.next();   
        if (u.equals("HuyHoang") && p.equals("2021"))     
        {
            System.out.print("thong bao da nhap dung"); 
        } else {
            System.out.print("thong bao nhap sai"); 
        }
    }  
}  
