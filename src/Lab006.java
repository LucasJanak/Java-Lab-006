import java.util.Scanner;

/**
 *
 * @author Lucas Janak
 *
 * @since Version 1.0
 */
public class Lab006 {
    int m;
    int n;
    public Lab006(int n,int m){
        this.m = m;
        this.n = n;
        /**
         * Assigns local variables from main as instance variables to be used by isDivisible
         *
         * @param Gathered from user input, n ultimately as the numerator and m as denominator
         */
        }

        public boolean isDivisible(int n, int m){
        return n % m == 0;
            /**
             * Tests whether n is perfectly divisible by m
             *
             * @param n is the numerator, m is the denominator
             * @return true if it is divisible, false if not
             */
    }
        public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What is the number being divided?");
         int n = in.nextInt();
        System.out.println("What number are you checking if it is divisible by?");
         int m = in.nextInt();
         Lab006 myObject = new Lab006(n, m);
         System.out.println("Is it divisible? "+myObject.isDivisible(n,m));


    }
}