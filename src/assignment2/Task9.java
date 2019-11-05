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
public class Task9 {
        public static void main(String[] args){
        int num1, num2, ans;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number: ");
            num1 = sc.nextInt();
            
            System.out.println("Enter Second Number: ");
            num2 = sc.nextInt();
        } 
        if(num1>num2){
            ans = num1-num2;
            System.out.println("Answer= "+ans);
      
        } else{
            ans = num2-num1;
            System.out.println("Answer= "+ans);
        }
            
    }
}
