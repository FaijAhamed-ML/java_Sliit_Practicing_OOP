package Que_03;
import java.util.Scanner;

public class WordWork {
    public static void main(String[] args) {
        Scanner get= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = get.nextLine();

        String[] words = sentence.split(" ");
        System.out.println("Total number of words: " + words.length);

        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println("Longest word: " + longestWord);


        String reversedSentence = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            reversedSentence = reversedSentence + sentence.charAt(i);
        }

        System.out.println("Reversed sentence: " + reversedSentence);

    }
}