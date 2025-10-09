package DSAFundamentals.Basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // int age =sc.nextInt();
        System.out.println("Enter Name");
        String name = sc.nextLine();    //both int and String dosent work together in a java prog. so use 
        System.out.println("Enter age");
        // int age = Integer.parseInt(sc.nextLine());
        int age =sc.nextInt();


    }
}
