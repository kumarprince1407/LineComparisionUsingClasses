package com.bridgelabz.line_comparision_using_classes;
//Line Comparison Using Classes
import java.util.*;
class Point{
    double x;
    double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
}
class Line{
    public Point start;//Taking Point class above
    public Point end;
    public Line(Point start, Point end){
        this.start=start;
        this.end =end;
    }
    //Length of line
    public double getLength(){
        double length=Math.sqrt(Math.pow(end.x - start.x,2)+Math.pow(end.y - start.y,2));
        return length;
    }
    public boolean equals(Line secondLine){
        boolean check = this.getLength() == secondLine.getLength();
        return check;
    }
    public int compareTo(Line secondLine){
        return Double.compare(this.getLength(),secondLine.getLength());
    }

}
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

        Point startPoint1 = new Point(x1,y1);
        Point endPoint1 = new Point(x2,y2);

        Line line1 = new Line (startPoint1,endPoint1);

        System.out.println("The length of the line L1 is: "+ line1.getLength());

        System.out.println("Enter the coordinates of Line 2.");
        System.out.print("Enter the value of x1:");
        double x3 = sc.nextDouble();
        System.out.print("Enter the value of x2:");
        double x4 = sc.nextDouble();
        System.out.print("Enter the value of y1:");
        double y3 = sc.nextDouble();
        System.out.print("Enter the value of y2:");
        double y4 = sc.nextDouble();

        Point startPoint2 = new Point(x3,y3);
        Point ecdPoint2 = new Point(x4,y4);
        Line line2= new Line(startPoint2,ecdPoint2);
        System.out.println("The length of the line L2 is: "+ line2.getLength());

        double compare = line1.compareTo(line2);
        if(compare>0){
            System.out.println("The length of line L1 is greater than L2.");
        }else if (compare<0){
            System.out.println("The length of line L2 is greater than L1.");
        }
        else{
            System.out.println("The length of L1 and L2 are equal.");
        }
    }
}
