package DSAFundamentals.Basics;

import java.util.Scanner;

public class IsNumberPrime {
    public static void main(String[] args) {
        // take t as input that shows the no. of inputs to be tested
        // take n as input t number of times
        // for each value of n print prime or not prime.
        // 1<t<10,000 and 1<n<10^9

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter t and n");
        int t = sc.nextInt();
        
        int count = 0;
        for (int i = 0; i < t; i++) {
            // code for prime
            int n = sc.nextInt();
            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    count++;
                    break;  //optimizes the code and checks as soon as u find 1 diviser/factor stop
                }

            }
            if (count >0) {
                System.out.println(n + "is Not Prime");
            } else {
                System.out.println(n + " is prime");
            }

        }


        //Printing Prime no. till n
        System.out.println("Enter till where u want to print prime Numbers.. In between a range");
        int low = sc.nextInt();
        int high = sc.nextInt();
        // int c=0;
        for (int i = low; i <= high; i++) {
            int c=0;
            //try to devide n and increament count c
            for (int div = 2; div*div <=i; div++) {
                if (i%div==0) {
                    c++;
                    break;
                }
            }
           if(c==0){
            System.out.print(i +" , ");
           }
        }

       
    }
}
