package assignment2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Task5 {
     public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = s.nextInt();
        
        double p = 3.1416;
        double sum = p*r*r;
        System.out.println("Area of the Circle is : "+sum);
        
    }
    
}
