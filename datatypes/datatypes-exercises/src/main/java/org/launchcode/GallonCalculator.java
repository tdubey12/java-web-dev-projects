package org.launchcode;
import java.util.Scanner;

public class GallonCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles:");
        Double miles =input.nextDouble();
        System.out.println("Enter gallons:");
        Double gallons = input.nextDouble();
        double average= miles/gallons;
        System.out.println("average miles-per-gallons:"+average);
    }
}
