package com.example.demo.interview;


import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        String input = "c-ab-cd";
        String result = revert(input);
        System.out.println(result);

    }
    public static String revert(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c))
                sb.append(stack.pop());
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
