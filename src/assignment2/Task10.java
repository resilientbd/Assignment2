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
public class Task10{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int num = s.nextInt();
        
         if(num%2==0){
              System.out.println("The number isEven ");
         }else{
             System.out.println("The number is odd ");
             
         }
       
        
        
    }
    
}
