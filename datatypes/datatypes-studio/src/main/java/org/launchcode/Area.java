package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius");
        if(input.hasNextDouble()) {
            double radius = input.nextDouble();
            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("Area " + area);
            } else {
                System.out.println("enter positive number");
            }
        }else{
            System.out.println("enter a number");
        }
        double radius;
        System.out.println("enter radius");
        do{
            while(!input.hasNextDouble()){
                System.out.println("enter a number");
                input.next();
            }
            radius= input.nextDouble();
            if(radius<0){
                System.out.println("enter a positive number");
                continue;
            }else {


                double area = Circle.getArea(radius);
                System.out.println("area of circle "+area);
                break;
            }

        }while(true);
    }
}
