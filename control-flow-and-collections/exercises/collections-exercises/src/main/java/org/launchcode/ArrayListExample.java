package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
      ArrayList<Integer> nums=new ArrayList<>();
      nums.add(2);
      nums.add(4);
      nums.add(5);
      nums.add(1);
      nums.add(2);
      nums.add(3);
      nums.add(6);
      nums.add(8);
      nums.add(9);
      nums.add(6);
        int totalEven =sumEven(nums);
        System.out.println("sum of even numbers:"+totalEven);
        ArrayList<String> words=new ArrayList<>();
        words.add("launch");
        words.add("code");
        words.add("launchcode");
        words.add("start");
        words.add("stop");
        words.add("again");
        printFive(words);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public  static void printFive(ArrayList<String> arr){
        for(String word:arr ){
            if(word.length()==5){
                System.out.println("five letters word:"+word);
            }

        }
        System.out.println("enter a word length:");
        Scanner input =new Scanner(System.in);

        int wordLength= input.nextInt();
        for(String word:arr ){
            if(word.length()==wordLength){
                System.out.println(wordLength+ " letters word:"+word);
            }

        }

    }

}
