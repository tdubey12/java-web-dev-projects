package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class Main  {
    public static void main(String[] args) {
        // Test out your Divide() function!

        try {
            System.out.println("Divide"+Divide(2,0));
        } catch (Exception e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");
        studentFiles.put("Teena" , "java.Program");

        // Test out your CheckFileExtension() function!
        HashMap<String, Integer> studentFileScore =new HashMap<>();

        for(Map.Entry<String, String> student: studentFiles.entrySet()){
            int score =-1;
            try{
                score = CheckFileExtension(student.getValue());

            }catch(IllegalArgumentException ie){
                System.out.println(student.getKey() +" "+ie.getMessage());
                ie.printStackTrace();
            }
            studentFileScore.put(student.getKey(),score);
        }

        for(Map.Entry<String, Integer> student:studentFileScore.entrySet()){
            System.out.println(student.getKey()+student.getValue());
        }

    }

    public static double Divide(int x, int y)
    {
       if(y==0) {
           try{
                throw new ArithmeticException("Cannot divide by 0");
           }catch(ArithmeticException ae){
               ae.printStackTrace();
               throw new RuntimeException(ae);
           }

       }
       return x/y;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        if(fileName==null || fileName.isEmpty()){
         throw new IllegalArgumentException("fileName is empty or null");
        }
        if(fileName.endsWith(".java")) {
            return 1;
        }else{
            return 0;
        }

    }
}