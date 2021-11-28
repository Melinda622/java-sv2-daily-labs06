package day04.hangman;

import java.util.Scanner;

public class Hangman {
    String wordToFind;
    String status;
    int chances;

    public Hangman(String wordToFind, String status, int chances) {
        this.wordToFind = wordToFind;
        this.status = status;
        this.chances = chances;
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public String getStatus() {
        return status;
    }

    public int getChances() {
        return chances;
    }

    private void run(String wordToFind, String status, int chances) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Itt tartasz: " + status);
            System.out.println(chances);
            System.out.println("Mi a következő tipped?");

            String guess = scanner.nextLine();
            if (wordToFind.contains(guess)) {
                status = updateWordFound(wordToFind, status, guess);
                System.out.println("A találat jó!");
            } else {
                System.out.println("A találat nem jó!");
                chances--;
            }
        }
        while (!wordToFind.equals(status) && chances > 0);

        if (wordToFind.equals(status)) {
            System.out.println("Ügyes vagy!");
        } else {
            System.out.println("Sajnos nem sikerult kitalálni a szót!");
        }
    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Hangman hangman = new Hangman("alma", "____", 8);
        hangman.run(hangman.getWordToFind(), hangman.getStatus(), hangman.getChances());
    }
}
