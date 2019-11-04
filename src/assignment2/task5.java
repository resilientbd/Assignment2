package assignment2;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter radius  : ");
        int r =scan.nextInt();
        
        double p = 3.1416;
        double sum = p*r*r;
        
        System.out.println("area of the circle is : "+sum);
    }

}
