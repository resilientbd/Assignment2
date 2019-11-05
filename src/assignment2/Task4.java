/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task4 {
    public static void main(String[] args) {
        int num1, num2, sum, product, difference;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        num1 = sc.nextInt();
        System.out.println("Enter Second number :");
        num2 = sc.nextInt();
        
        sum = num1 + num2;
        product = num1 * num2;
        difference = num1 - num2 ;
        System.out.println("Summation Is = "+sum);
        System.out.println("product Is = "+product);
        System.out.println("difference Is = "+difference);
        
    }
    
}
