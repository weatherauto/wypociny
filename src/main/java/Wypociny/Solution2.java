package Wypociny;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Example program that demonstrates print vs println.
 */

public class Solution2 {


    /**
     * Prints a greeting.
     */

    public static void main(String[] args) {

//        System.out.println(isSingleDigit(2));
//        boolean bigFlag = !isSingleDigit(17);
//        System.out.println(bigFlag);
//        System.out.println(factorial(3));
        //sequence(45);
        printTable(30);

    }



    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    public static long factorial(long n) {
        if (n == 0) {
            return 1;
        }
        long recurse = factorial(n - 1);
        long result = n * recurse;
        return result;
    }

    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) { // n is even
                n = n / 2;
            } else { // n is odd
                n = n * 3 + 1;
            }
        }
    }
    public static void printRow (int n, int cols){
        int i = 1;
        while (i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();

    }

    public static void printTable(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow(i, i);
            i = i + 1;
        }
    }








    }






