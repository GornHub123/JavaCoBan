/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author HP
 */
import java.util.Scanner;
class New {
    public static void main(String[] args) {
        double IntR;
        double NoY;
        double LoanA;
        double MonP;
        double TotP;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Interest Rate :");
        IntR = scanner.nextDouble();
        System.out.println("Nhap Number of Years :");
        NoY = scanner.nextDouble();
        System.out.println("Nhap Loan Amount :");
        LoanA = scanner.nextDouble();
        MonP = (LoanA*IntR)/(1-(1/Math.pow((1+IntR),(NoY*12))));
        System.out.println("Monthly Payment La : "+MonP);
        System.out.println("Tolal Payment La : "+MonP*12*NoY);
    }
}
