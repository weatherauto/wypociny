package Wypociny;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class random_numbers {

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;

    }

    public static void main(String[] args){

        //randomArray(100);
        //System.out.print(Arrays.toString(randomArray(100)));

        int[] counts = new int[100];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = inRange(randomArray(100), i, i + 1);

        }
        System.out.print(Arrays.toString(counts));
    }



    public static int inRange(int[] a, int low, int high) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] < high) {
                count++;
            }
        }
        return count;
    }























}
