package _6kyu.MyFristInterpreter;

public class MyFirstInterpreter {
    public static void main(String[] args) {
        MyFirstInterpreter i6 = new MyFirstInterpreter(
                "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++." +  // 72 = 'H'
                        "+++++++++++++++++++++++++++++++++."                                         // +33 → 105 = 'i'
        );
        System.out.println(i6.interpret());
        MyFirstInterpreter i5 = new MyFirstInterpreter("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++."
                + "++++++++++++++++++++++++++++++."
                + "+++++++++++++++.");
        System.out.println(i5.interpret());

    }

    private final String code;
    public MyFirstInterpreter(String code) {

        this.code = code;
    }

    /**
     * Interprets the given code.
     * Supported instructions:
     * '+' increases the memory value (wraps around at 256).
     * '.' appends the character corresponding to the current memory value.
     *
     * @return The interpreted output as a string.
     */

    public String interpret() {

        int memory = 0;// Memory cell value (0–255), used as the current character code.
        StringBuilder output = new StringBuilder();

        // Loop through each instruction in the code string
        for (char instruction : code.toCharArray()) {
            if (instruction == '+') {
                memory = (memory + 1) % 256;// Increment memory, wrap around at 256 to stay within ASCII range
            } else if (instruction == '.') {
                output.append((char) memory);// Convert memory value to a character and append to output
            }
        }

        return output.toString();
    }
}
