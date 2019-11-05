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
public class Task5 {
    public static void main(String[] args)  {
                 Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Radius: ");
        float Radius;
        Radius = sc.nextFloat();
        double circumference,area;
        double pi=3.1416;
        double r = 0;
        circumference = 2*pi*Radius;
        area = pi*Radius*Radius;

        System.out.println("circumference= "+circumference);
        System.out.println("Area= "+area);
         
         
         
    }
    
}
