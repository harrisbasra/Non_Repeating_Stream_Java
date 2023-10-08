package com.nonrepeatstream.java;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Stream stream = new Stream();
        Scanner scanner = new Scanner(System.in);
        String display = "";

        System.out.println("Enter characters (press -1 to exit):");

        char input;
        while (true) {
            String inputStr = scanner.nextLine();
            if (inputStr.equals("-1")) {
                break;
            }

            if (inputStr.length() != 1) {
                System.out.println("Please enter a single character.");
                continue;
            }

            input = inputStr.charAt(0);
            if (Character.isLetter(input)) {
                stream.add(input);
                display = display.concat(" " + input);
            } else {
                System.out.println("Please enter a valid alphabet character.");
            }
        }
        scanner.close();

        char result = stream.getFirstNonRepeating();
        System.out.println("You gave input: "+display);
        System.out.println("First non-repeating character: " + (result != '-' ? result : "None"));
    }
}
