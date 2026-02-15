# Josephus Permutation (5kyu)
** Link:** [Solve this kata on Codewars](https://www.codewars.com/kata/5550d638a99ddb113e0000a2)
## Versions
- `Josephus.java`: First working version.
- ``: Refactoring version()

## Examples
```java
        ArrayList<Integer> group1 = new ArrayList<>(
                Arrays.asList(12, 14, 18, 23, 24, 26, 27)
        );
        ArrayList<Integer> group2 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 6, 12, 13)
        );
        ArrayList<Integer> group3 = new ArrayList<>(
                Arrays.asList(23, 25, 28, 30, 31, 34, 36)
        );
        System.out.println(josephusPermutation(group1, 2));//[14, 23, 26, 12, 24, 18, 27]
        System.out.println(josephusPermutation(group2, 4));//[4, 1, 12, 6, 13, 3, 2]
        System.out.println(josephusPermutation(group3, 3));//[28, 34, 25, 36, 31, 23, 30]
