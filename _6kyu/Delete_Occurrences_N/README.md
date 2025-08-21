# Delete accurrences of an element if it occurs more than n times (6kyu)
** Link:** [Solve this kata on Codewars](https://www.codewars.com/kata/554ca54ffa7d91b236000023)
## Versions
- `EnoughIsEnough.java`: First working version.
- ``: Refactoring version()

## Examples
```java
    int[] elements =  {1, 2, 1, 2, 1, 2, 1, 2};
		int maxOccurrences = 3;

		System.out.println(Arrays.toString(deleteNth(elements, maxOccurrences)));//[1, 2, 1, 2, 1, 2]
		
		int[] elements1 =  {3, 3, 3, 3, 3};
		int maxOccurrences1 = 10;

		System.out.println(Arrays.toString(deleteNth(elements1, maxOccurrences1)));//[3, 3, 3, 3, 3]

		int[] elements2 = {0, 0, 1, 0, 2, 2, 0, 3};
		int maxOccurrences2 = 2;

		System.out.println(Arrays.toString(deleteNth(elements2, maxOccurrences2)));//[0, 0, 1, 2, 2, 3]
