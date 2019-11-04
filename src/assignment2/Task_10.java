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
public class Task_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Write the Java code of a program that reads a number, and prints “The number is even” or “The
        number is odd”, depending on whether the number is even or odd. (Hint: use the modulus
        operator)
        */
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1=sc.nextInt();
    
        if (num1%2==0) {
            System.out.println("The number is even");
        }
        
        if (num1%2==1) {
            System.out.println("The number is odd");
        }
    }
    
}
