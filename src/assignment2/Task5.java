
package assignment2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
            float r;
            System.out.println("Enter the redius of circle = ");
            
            r=input.nextFloat();
          double  area=3.1416*r*r;
            double circumference = 2*3.1416*r;
            
            System.out.println("Circle of Area = "+area);
           System.out.println("Circle of Circumference = "+circumference);
           
    }

    
}
