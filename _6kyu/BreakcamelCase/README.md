# Esolang Interpreters #1 - Introduction to Esolangs and My First Interpreter (MiniStringFuck) (6kyu)
** Link:** [Solve this kata on Codewars](https://www.codewars.com/kata/586dd26a69b6fd46dd0000c0)
## Versions
- `MyFirstInterpreter.java`: First working version.
- ``: Refactoring version()

## Examples
```java
     MyFirstInterpreter i6 = new MyFirstInterpreter(
        "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++." +  // 72 = 'H'
        "+++++++++++++++++++++++++++++++++++++++++++++++."                         // 105 = 'w'
    );
    System.out.println(i6.interpret());
    MyFirstInterpreter i5 = new MyFirstInterpreter("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++."
                                             + "++++++++++++++++++++++++++++++."
                                             + "+++++++++++++++.");
    System.out.println(i5.interpret());

