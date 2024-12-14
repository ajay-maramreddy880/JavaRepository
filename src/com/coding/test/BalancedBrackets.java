package com.coding.test;

import java.util.Stack;

public class BalancedBrackets {

    public static String checkBalancedBrackets(String exp) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.peek(), ch)) {
                    return "Not Balanced";
                }
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
        	return "Balanced";
        }
        return "Not Balanced";
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || 
               (open == '{' && close == '}') || 
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        System.out.println(checkBalancedBrackets("[()]{}{[()()]()}"));
        System.out.println(checkBalancedBrackets("[(])")); 
    }
}

