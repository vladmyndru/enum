package app;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        Motivator motivator = new DaysAdvice();

        System.out.println("Input one of MONDAY, TUESDAY, WEDNESDAY, " +
                "THURSDAY, FRIDAY, SATURDAY, SUNDAY:");
        String input = scanner.nextLine().toUpperCase();

        try {
            Day day = Day.valueOf(input);
            motivator.advice(day);
        } catch (Exception e) {
            System.out.println("Invalid day entered");
        }
    }
}

