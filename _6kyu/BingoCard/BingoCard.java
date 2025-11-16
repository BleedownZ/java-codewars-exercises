package _6kyu.BingoCard;

import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class BingoCard {
    public static void main(String[] args) {
        // Call the method to generate one bingo card
        String[] bingoCard = getCard();

        /* Print the bingo card elements */
        System.out.println("Generated Bingo Card:");
        assert bingoCard != null;
        for (String s : bingoCard) {
            System.out.print(s + " ");

        }
    }
    public static String[] getCard() {
        String [] cardBingo = new String[24];
        String[] letters = new String[]{"B", "I", "N", "G", "O"};
        int [] numbersLetters = new int[]{5, 5, 4, 5, 5};
        //Create a random objet
        Random random = new Random();
        //Create loop for access an array before
        int position = 0;

        for (int j = 0; j < numbersLetters.length && position < cardBingo.length; j++){
            Set<Integer> uniqueNumbers = new HashSet<>();
            int origin;
            int bound;

            switch (letters[j]) {
                case "B":
                    origin = 1;
                    bound = 15;
                    break;
                case "I":
                    origin = 16;
                    bound = 30;
                    break;
                case "N":
                    origin = 31;
                    bound = 45;
                    break;
                case "G":
                    origin = 46;
                    bound = 60;
                    break;
                case "O":
                    origin = 61;
                    bound = 75;
                    break;

                default:
                    return null;
            }
            // Generate unique numbers for the current column
            while (uniqueNumbers.size() < numbersLetters[j]) {
                int numberRandom = random.nextInt(bound - origin + 1) + origin;
                if (uniqueNumbers.add(numberRandom)) {
                    // Only add to card if it's unique
                    cardBingo[position] = letters[j] + numberRandom;
                    position++;
                }
            }

        }


        return cardBingo;
    }
}
