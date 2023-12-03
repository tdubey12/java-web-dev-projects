package org.launchcode;

public class Arrays {

    public static void main(String[] args) {
      int[] intArray= new int[]{1, 1, 2, 3, 5, 8};
      for(int i: intArray){
          if(i%2!=0) {
              System.out.println(i);
          }
      }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] splitBySpaces = phrase.split(" ");
        for(String word:splitBySpaces) {
            System.out.println(word);
        }

        String[] splitByDot =phrase.split("\\.");
        for(String sentence:splitByDot){
            System.out.println(sentence);
        }

    }
}
