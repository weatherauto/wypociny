package Wypociny;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution2 {


    public static double sum(double[] a) {
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total = total + a[i];
        }
        return total;
    }



    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        //printArray(a);

        int[] counts;
        double[] values;

        counts = new int[4];
        counts = new int[4];

        double[] b = {2,4,6,8,10};
        double [] c = b;


        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(b.length);
        System.out.println(c.length);
        b[0]=100;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        double[] d= Arrays.copyOf(b,b.length);
        //d = Arrays.copyOf(b,10);

        System.out.println(Arrays.toString(d));
        d[4] = 333;
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        System.out.println(sum(b));
        System.out.println(sum(c));
        System.out.println(sum(d));







// System.out.println(isSingleDigit(2));
//        boolean bigFlag = !isSingleDigit(17);
//        System.out.println(bigFlag);
//        System.out.println(factorial(3));
        //sequence(45);
        //printTable(30);

    }

    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
        System.out.println(a.length);
        String blabla = Arrays.toString(a);
        System.out.println(blabla);


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






