package org.example.app;

import java.util.Stack;

public class Parentesis {
    public static boolean revisar(String expresion) {
        Stack<Character> stack = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if (!comprobar(last, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean comprobar(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression = ")(";
        System.out.println("La expresión está balanceada: " + revisar(expression));
    }
}
