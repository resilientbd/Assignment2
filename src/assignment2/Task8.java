
package assignment2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the number ");
    int a= input.nextInt();
    int b=input.nextInt();
    if(a>b)
        System.out.println(" First is greater ");
    else if(b>a)
        System.out.println("Second is   greater ");
    
       else
        System.out.println("The number is equal");
    }
}
