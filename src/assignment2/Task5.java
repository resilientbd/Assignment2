
package assignment2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
    
        Scanner myscan = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = myscan.nextInt();
        
        double p = 3.1416;
        double sum = p*r*r;
        System.out.println("Area of the Circle is : "+sum);
        
    }
    
}
