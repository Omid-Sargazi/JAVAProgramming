package FunctionalProgramming.Projects;

import java.util.Scanner;

public class CharacterFrequencyBarChart {
    public static void main(String[] args) {
        // Initialize an array to store the frequency of each alphabet character
        int[] frequencies = new int[26]; // 26 letters in the English alphabet

        // Input the document
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the document text: ");
        String document = scanner.nextLine();

        // Convert the document to lowercase and count the frequency of each letter
        document = document.toLowerCase();
        for (int i = 0; i < document.length(); i++) {
            char ch = document.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                frequencies[ch - 'a']++;
            }
        }

        // Display the bar chart for character frequencies
        System.out.println("\nCharacter Frequency Bar Chart:");
        for (int i = 0; i < frequencies.length; i++) {
            char letter = (char) ('a' + i);
            System.out.print(letter + " : ");
            for (int j = 0; j < frequencies[i]; j++) {
                System.out.print("*");
            }
            System.out.println(" (" + frequencies[i] + ")");
        }
    }
}