import java.util.*;
import java.io.*;
import java.lang.*;

public class Sequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // t -> number of testcases
        System.out.print("Number of testcases you want to run: ");
        int t = sc.nextInt();

        while (t-- > 0) {
            // array size
            System.out.print("Array size: ");
            int N = sc.nextInt();

            int[] A = new int[N];
            int[] B = new int[N];

            System.out.print("A: ");

            for(int i = 0; i < N; i++)
                A[i] = sc.nextInt();

            System.out.print("B: ");

            for(int i = 0; i < N; i++)
                B[i] = sc.nextInt();

        
            System.out.println("The number of integers that satisfy the condition: \n" + findNumber(A, B));

        }
        sc.close();


    }


    static int findNumber(int[] A, int[] B) {

        /*
         Technically, the integer range is limited to the highest value of A and the lowest value of B
         since we're trying to get numbers that satisfy A[i] <= x <= B[i] for all i.
         Thus just by substracting minimum value of B from maximum value of A, we get the range of numbers
         and since we're including both the ranges, we're adding 1 to the final answer.
         */
        int aMaxVal = A[0], bMinVal = B[0];

        for(int num : A)
            aMaxVal = Math.max(aMaxVal, num);
        
        for(int num: B)
            bMinVal = Math.min(bMinVal, num);

        // If the range is negative, then there are no numbers that satisfy the condition
        return bMinVal - aMaxVal >= 0 ? bMinVal - aMaxVal + 1 : 0;
    }
}
