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
public class Task8 {
    public static void main(String[] args) {
        
            Scanner input=new Scanner(System.in);
       System.out.println("enter the number = ");
       int a=input.nextInt();
       int b=input.nextInt();
       if(a>b){
           System.out.println("First is greater");
           
       }
       else if(a==b){
           System.out.println("The numbers are equal");
       
       }
       else{
           System.out.println("First is not greater");
       }
    }

    
}
