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
public class Task10 {
     public static void main(String args[])
   {
      int x;
      System.out.println("Enter odd or even number ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
     
      if (x % 2 == 0)
         System.out.println("The number is even.");
      else
         System.out.println("The number is odd.");
   }
}
    

