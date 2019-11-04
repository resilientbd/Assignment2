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
public class Task7 {
    
    public static void main (String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        
        System.out.print("Enter First Number : ");
        number1 = scanner.nextInt();
        
        System.out.print("Enter Second Number : ");
        number2 = scanner.nextInt();
        
        if(number1>number2){
            System.out.println("First Number is greater");
        }else{
            System.out.println("First Number is not greater");
        }
     
        
    }
    
}
