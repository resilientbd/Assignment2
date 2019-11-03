package assignment2;

import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float area,cir;
        System.out.print("Enter the vakue of r =");
        int r=input.nextInt();
        area=(float)(3.1416*r*r);
        cir=(float)(2*3.1416*r);
        System.out.println("area is " +area);
        System.out.println("circumference " +cir);
    }
    
}
