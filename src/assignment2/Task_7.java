/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author RIYAD Patwary
 */
public class Task_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads two numbers from the user. Your program should
        then print “first is greater” if the first number is greater, and “first is not greater” otherwise.
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        
        if (num1>num2) {
            System.out.println("The first number is greater");
        } else { 
            System.out.println("The first number is not greater");
            }
    
    }
}
