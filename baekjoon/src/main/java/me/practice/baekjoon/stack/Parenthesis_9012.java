package me.practice.baekjoon.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis_9012 {

    private static final char LEFT_PARENTHESIS = '(';
    private static final char RIGHT_PARENTHESIS = ')';
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) throws IOException {
        // https://www.acmicpc.net/problem/9012
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        for (int i = 0; i < length; i++) {
            System.out.println(execute(br.readLine()));
        }
    }

    private static String execute(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == LEFT_PARENTHESIS) {
                stack.push(c);
            } else if (c == RIGHT_PARENTHESIS) {
                if (stack.isEmpty()) {
                    return NO;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            return YES;
        } else {
            return NO;
        }
    }
}
