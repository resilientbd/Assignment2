/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author AMITABH
 */
public class Task5 {
    public static void main(String[] args) {
        System.out. println("Enter the radis r: ");
        Scanner in = new Scanner(System.in);
        float r = in. nextFloat();
        double c,a;
        double pi=3.1416;
        c= 2*pi*r;
        a=pi*r*r;
        System.out. println("The Circumference is: "+c);
        System.out. println("The Area is: "+a);
        
    
    }
}
