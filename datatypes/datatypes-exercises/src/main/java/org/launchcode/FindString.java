package org.launchcode;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
      String alice ="Alice was beginning to get very tired of sitting by her sister on the" +
              " bank, and of having nothing to do: once or twice she had peeped into the book" +
              " her sister was reading, but it had no pictures or conversations in it, " +
              "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a word to search:");
        String word =input.next();
        System.out.println(alice.toLowerCase().contains(word.toLowerCase()));
        Integer index = alice.indexOf(word);
        Integer length = word.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String modifiedSentence = alice.replace(word, "");
        System.out.println(modifiedSentence);
    }
}
