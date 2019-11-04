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
public class Task5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        float r;
        System.out.println("Enter the redius circle");
        
        r = input.nextFloat();
        double area = 3.1416*r*r;
        double cricumference = 2 * 3.1416 *r;
        
        System.out.println("circle of Area =+area");
        System.out.println("circle of cricumference = " + cricumference);
        
        
    }
    
}
