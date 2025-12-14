package _6kyu.ReversePolishNotCal;

import java.util.Stack;

public class ReversePolishNotCal {
    public static void main(String[] args) {
        System.out.println(evaluate(" 5 1 2 + 4 * + 3 -"));
        System.out.println(evaluate("4 2 5 * + 1 3 2 * + /"));
        System.out.println(evaluate("7 2 /"));
    }
    public static double evaluate(String expr) {
        //Check if the input is null or empty quiting the leading and trailing
        if (expr == null ||expr.trim().isEmpty()){
            return 0;
        }
        //Split the input and create a class for save numbers
        String [] rpn = expr.trim().split("\\s+");
        Stack<Double> stack = new Stack<>();
        //Check every character to input
        for (String token : rpn) {
            //Calculate if the token is an operator.
            if ("+-*/".contains(token)) {
                double b = stack.pop();//Store the first number
                double a = stack.pop();//Store the second number
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            } else {
                stack.push(Double.parseDouble(token));//add an operand to Stack
            }

        }
        return stack.pop();
    }
}
