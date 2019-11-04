package assignment2;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {
        int x;
        System.out.print("enter odd or event number : ");
        Scanner scan = new Scanner(System.in);
        x =scan.nextInt();
        
        if(x % 2 == 0)
        System.out.println("the number is even");
        else{
        System.out.println("the number is odd");
            
        }
    }

}
