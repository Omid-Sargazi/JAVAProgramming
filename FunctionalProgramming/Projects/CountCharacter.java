package FunctionalProgramming.Projects;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        int[] frequencies = new int[26];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the document text: ");

        String document = scanner.nextLine();

        document = document.toLowerCase();
        for (int i = 0; i < document.length(); i++) {
            char ch = document.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                frequencies[ch - 'a']++;
            }
        }
        System.out.println("\nCharacter Frequency Bar Chart:");

        for (int i = 0; i < frequencies.length; i++) {
            char letter = (char) ('a' + i);
            System.out.print(letter + " : ");
            for (int j = 0; j < frequencies[i]; j++) {
                System.out.print("*");
            }
            System.out.println("(" + frequencies[i] + ")");
        }
    }
}
