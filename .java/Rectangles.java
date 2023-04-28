import java.util.*;
import java.io.*;
import java.lang.*;

public class Rectangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of testcases you want to run: ");
        // t -> number of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            Point l1 = new Point(), r1 = new Point(), l2 = new Point(), r2 = new Point();

            System.out.print("Enter l1 coordinates: ");
            l1.x = sc.nextDouble();
            l1.y = sc.nextDouble();

            System.out.print("Enter r1 coordinates: ");
            r1.x = sc.nextDouble();
            r1.y = sc.nextDouble();

            System.out.print("Enter l2 coordinates: ");
            l2.x = sc.nextDouble();
            l2.y = sc.nextDouble();

            System.out.print("Enter r2 coordinates: ");
            r2.x = sc.nextDouble();
            r2.y = sc.nextDouble();


            if(doOverlap(l1, r1, l2, r2))
                System.out.println("Rectangles overlap");
            else
                System.out.println("Rectangles do not overlap");

            
        }
        sc.close();


    }


    static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        /*
        We only need to check if one of the rectangles is above another or on the left side of another.
        Other that that, in every other case they will overlap or at least touch each other.
        */

        // if one rectangle is on left side of other 
        if(l2.x > r1.x || l1.x > r2.x)
            return false;
        
        // if one rectangle is above another
        if(r1.y > l2.y || r2.y > l1.y)
            return false;
        
        // if none of them is true, the rectangles overlap

        return true;
    }

    static class Point {
        double x, y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public Point() {
            this.x = 0;
            this.y = 0;
        }

        public boolean equals(Point p) {
            return (this.x == p.x && this.y == p.y);
        }

    }

}
