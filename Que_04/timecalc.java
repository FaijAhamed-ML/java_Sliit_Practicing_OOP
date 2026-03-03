package Que_04;

import java.util.Scanner;
public class timecalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;

        int remainingSecondsAfterHours = totalSeconds % 3600;

        int minutes = remainingSecondsAfterHours / 60;

        int seconds = remainingSecondsAfterHours % 60;

        System.out.println(totalSeconds + " seconds is equivalent to:");
        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");

        input.close();
    }
}
