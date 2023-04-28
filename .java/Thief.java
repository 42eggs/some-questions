import java.util.*;
import java.io.*;
import java.lang.*;

public class Thief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // t -> number of testcases
        System.out.print("Number of testcases you want to run: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            // number of houses
            System.out.print("Number of houses: ");
            int N = sc.nextInt();

            // amount of money in each house
            System.out.print("Amount of money each house has: ");
            int K = sc.nextInt();

            
            System.out.println("The maximum amount of money the thief can steal: " + maximizeMoney(N, K));
        }
        sc.close();


    }


    static int maximizeMoney(int N, int K) {
        
        /* 

        if N is an even number, it can go to N/2 houses 
        and if N is an odd number, it can go to ceil of N/2 houses or N/2 + 1 houses

        N/2.0 is used to get the decimal value of N/2 and then Math.ceil() is used to round up the value
        to the nearest double and finally it is downcasted to an int

        An alternative would be:

        int houses = N/2;
        if(N%2 != 0)
            houses++;
        return houses*K;
        
        */

        N = (int)Math.ceil(N/2.0);

        // returns the total amount of money the thief can steal
        return N*K;
    }

}











