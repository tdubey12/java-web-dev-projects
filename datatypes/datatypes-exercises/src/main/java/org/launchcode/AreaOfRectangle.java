package org.launchcode;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length");

        int length = input.nextInt();
        System.out.println("Enter width");

        int width = input.nextInt();
        int area =length*width;

        System.out.println("Area " + area);
    }
}
