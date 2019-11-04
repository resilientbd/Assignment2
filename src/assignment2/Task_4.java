/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author RIYAD Patwary
 */
public class Task_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads two numbers from the user, and prints their sum, product and difference.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sc.nextInt();
        System.out.println("Enter the second number:");
        int num2=sc.nextInt();
        int sum=num1+num2;
        int dif=num1-num2;
        int mul=num1*num2;
        System.out.println("Sum of the inputed numbers is "+sum);
        System.out.println("Difference of the inputed numbers is "+dif);
        System.out.println("Product of the inputed numbers is "+mul);
    }
    
}
