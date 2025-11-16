# Bingo Card (6kyu)
** Link:** [Solve this kata on Codewars](https://www.codewars.com/kata/566d5e2e57d8fae53c00000c)
## Versions
- `BingoCard.java`: First working version.
- ``: Refactoring version()

## Examples
```java
        public static void main(String[] args) {
    // Call the method to generate one bingo card
    String[] bingoCard = getCard();

    // Print the bingo card elements
    System.out.println("Generated Bingo Card:");
    for (int i = 0; i < bingoCard.length; i++) {
        System.out.print(bingoCard[i] + " ");

        // Optional: make a line break every 5 values (for better readability)
        if ((i + 1) % 5 == 0) {
            System.out.println();
        }
    }
}


