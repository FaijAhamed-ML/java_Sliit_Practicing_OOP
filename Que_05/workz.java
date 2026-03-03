package Que_05;
import java.util.Scanner;

public class workz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            int j=i+1;
            System.out.print("Enter "+j+" words:");
            words[i] = input.next();
        }

        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);

        int totalChars = 0;
        for (int i = 0; i < words.length; i++) {
            totalChars += words[i].length();
        }
        System.out.println("Total characters: " + totalChars);

        System.out.print("Words with even length: ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.print(words[i] + " ");
            }
        }
    }
}