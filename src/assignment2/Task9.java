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
public class Task9{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1 = s.nextInt();
        
        System.out.println("Enter 2nd Number : ");
        int num2 = s.nextInt();
        
         if(num1 > num2){
              System.out.println("The Subtractions of the number is " + (num1-num2));
         }else{
             System.out.println("The Subtractions of the number is " +(num2-num1));
             
         }
       
        
        
    }
    
}
