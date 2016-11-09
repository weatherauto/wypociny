package Wypociny;

import java.util.Scanner;

public class PrintTime {


    public static void main(String[] args) {

        double radius = distance(1, 2, 4, 6);
        double area = calculateArea(1,3,4,5);
        System.out.println(area);
        double area02 = calculateArea(5);
        System.out.println(area02);

           }


    public static double distance
            (double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static double calculateArea (double xc, double yc, double xp, double yp) {
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }
}

