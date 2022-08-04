package stack;

import java.util.Scanner;
import java.util.Stack;

// 균형잡힌 세상
public class Sol_4949 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        while(true) {
            s = in.nextLine();
            if(s.equals(".")) {	// 종료 조건문
                break;
            }
            System.out.println(solve(s));
        }
    }

    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '[') { // 여는 괄호일 경우 스택에 push
                stack.push(c);
            } else if(c == ')') { // 닫는 소괄호 일 경우
                // 스택이 비어있거나 pop할 원소가 소괄호랑 매칭이 안되는 경우
                if(stack.empty() || stack.peek() != '(') {
                    return "no";
                } else {
                    stack.pop();
                }
            } else if(c == ']') {
                // 스택이 비어있거나 pop할 원소가 대괄호랑 매칭이 안되는 경우
                if(stack.empty() || stack.peek() != '[') {
                    return "no";
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.empty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}