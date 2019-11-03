/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Task6 {
    private static Scanner sc;
   public static void main(String[] args) 
	{
		int number1, number2;
		sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number : ");
		number1 = sc.nextInt();	
		
		System.out.print(" Enter the Second Number : ");
		number2 = sc.nextInt();	
		
		if(number1 > number2) 
	    {
			System.out.println("The Greater Number = " + number1);          
	    } 
	    else if (number2 > number1)
	    { 
	    	System.out.println("The Greater Number = " + number2);        
	    } 
	    		
	}	
}
        
        
    
    

