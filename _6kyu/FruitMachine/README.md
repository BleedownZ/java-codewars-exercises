# Fruit Machine (6kyu)
** Link:** [Solve this kata on Codewars](https://www.codewars.com/kata/590adadea658017d90000039)
## Versions
- `FruitMachine.java`: First working version.
- ``: Refactoring version()

## Examples
```java
      String[][] reels = {
                {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"},
                {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"},
                {"Wild","Star","Bell","Shell","Seven","Cherry","Bar","King","Queen","Jack"}
        };
        int[] spin = {1, 1, 1};
        int[] spin1 = {2, 3, 4};
        int[] spin2 = {8, 8, 8};
        System.out.println(fruit(reels,spin));
        System.out.println(fruit(reels,spin1));
        System.out.println(fruit(reels,spin2));