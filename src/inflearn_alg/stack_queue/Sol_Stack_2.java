package inflearn_alg.stack_queue;

import java.util.Scanner;
import java.util.Stack;

// 괄호 문자 제거
public class Sol_Stack_2 {
    static String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == ')') {
                while(stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }
        for(int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
