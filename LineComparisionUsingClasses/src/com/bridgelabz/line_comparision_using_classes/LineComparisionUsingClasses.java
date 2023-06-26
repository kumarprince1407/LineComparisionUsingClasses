package com.bridgelabz.line_comparision_using_classes;
//Line Comparison Using Classes
import java.util.*;
public class LineComparisionUsingClasses {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison computation program! ");
        System.out.println("Enter the coordinates of Line 1.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1:");
        double x1 = sc.nextDouble();
        System.out.print("Enter the value of x2:");
        double x2 = sc.nextDouble();
        System.out.print("Enter the value of y1:");
        double y1 = sc.nextDouble();
        System.out.print("Enter the value of y2:");
        double y2 = sc.nextDouble();

        double l1 = (Math.sqrt(Math.pow((x2 - x1),2) )+ Math.pow((y2 -y1),2));
        System.out.println("The length of the line L1 is: "+ l1);
    }
}
