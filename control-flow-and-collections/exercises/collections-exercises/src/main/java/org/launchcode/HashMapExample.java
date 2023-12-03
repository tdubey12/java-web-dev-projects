package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your students (or Id=-1 to finish):");
        // Get student names and grades
        do {
            System.out.print("Student Id: ");
            int studentID=0;
            if(input.hasNextInt()) {
                studentID = input.nextInt();
            }
            if(studentID==-1){
                break;
            }
            input.nextLine();
                System.out.print("student name: ");
                String studentName = input.nextLine();
                students.put(studentID, studentName);
                //input.nextLine();
        } while(true);
        // Print class roster
        System.out.println("\nClass roster:");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + "- " + student.getValue() );
        }
    }
}
