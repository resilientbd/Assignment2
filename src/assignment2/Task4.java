/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Task4 {
    public static void main(String[] args)
    {
        
        Scanner scanner  = new Scanner(System.in);
        
        int number1, number2 ,result;
        
        System.out.println("Enter the first number: ");
        number1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        number2 = scanner.nextInt();
        
  
        result = number1 + number2;
        System.out.println("sum = " +result);
        
        result = number1 - number2;
        System.out.println("difference = " +result);
        
        result = number1 * number2;
        System.out.println("product = " +result); 
        
        
        
        
    
    
    }
    
}
