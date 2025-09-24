package DSAFundamentals.Basics;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks = sc.nextInt();

        if(marks>90){
            System.out.println("Excellent");
        }else if(marks>80)
        System.out.println("good");
        else if(marks>70){
            System.out.println("Avg.");
        }else if(marks >60)
        System.out.println("meets Expectation");
        else
        System.out.println("fail!! , Good Luck Try next Time");
    }
    
}
