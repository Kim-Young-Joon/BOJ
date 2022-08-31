package stack;

import java.util.Scanner;
import java.util.Stack;

// 좋은 단어
public class Sol_3986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) arr[i] = sc.next();

        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (char c : arr[i].toCharArray()) {
                if (stack.size() == 0) {
                    stack.push(c);
                } else {
                    if (stack.peek() == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.size() == 0) {
                answer++;
            } else {
                stack.clear();
            }
        }

        System.out.println(answer);
    }
}
