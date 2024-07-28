package org.example.app;

import java.util.Stack;

public class RevertirCadena {
    public static String generar(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = generar(original);
        System.out.println("Original: " + original);
        System.out.println("Reversado: " + reversed);
    }
}
