# Snakes and Ladders(6kyu)
** Link:** [Solve this kata on Codewars](https://www.codewars.com/kata/587136ba2eefcb92a9000027)
## Versions
- `SnakesLadders.java`: First working version.
- ``: Refactoring version()

## Examples
```java
    SnakesLadders game = new SnakesLadders();

    // Example moves:
    System.out.println(game.play(1, 3)); // Player 1 plays doubles? No → Player 2 plays
    System.out.println(game.play(1, 5)); // Player 2 plays doubles? No → Player 1 plays
    System.out.println(game.play(6, 6)); // Player 1 plays again because of doubles
    System.out.println(game.play(3, 7)); // Player 2 plays doubles? No → Player 1 plays
    System.out.println(game.play(4, 4)); // Player 1 plays reroll for dobles
    System.out.println(game.play(2, 3)); // Normal turn


