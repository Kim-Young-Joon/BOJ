package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호의 값
public class Sol_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        Stack<Character> stack = new Stack<>();

        boolean flag = true; // 올바른 괄호열인지 판단하는 변수
        int answer = 0;
        int cnt = 1;


        for(int i=0; i<line.length(); i++) {
            char c = line.charAt(i);

            if(c == '(') {
                stack.push(c);
                cnt *= 2;
            } else if(c == '[') {
                stack.push(c);
                cnt *= 3;
            } else {
                if(c == ')') {
                    if(stack.isEmpty() || stack.peek() != '(') {
                        /**
                         * 닫는 소괄호가 왔을 때, stack 이 비어 있는 상황 이거나
                         * stack 맨 마지막에 있는 것이 여는 소괄호가 아닌 경우
                         * -> 즉, 잘못된 괄호열
                         */
                        flag=false;
                        break;
                    }
                    if(line.charAt(i - 1) =='(') {
                        /**
                         * 닫는 소괄호가 왔을 때, 바로 직전 항으로 여는 소괄호가 온 경우
                         * 즉, 소괄호 사이에 값이 들어오지 않아 곱할 것이 추가로 없는 경우
                         */
                        answer += cnt;
                    }
                    stack.pop();
                    cnt /= 2;
                } else if(c == ']') { // 소괄호의 경우와 동일
                    if(stack.isEmpty() || stack.peek() != '[') {
                        flag=false;
                        break;
                    }
                    if(line.charAt(i-1)=='[') {
                        answer += cnt;
                    }
                    stack.pop();
                    cnt /= 3;
                } else {
                    /**
                     * 닫는 괄호가 오지 않은 경우는 잘못된 괄호열
                     */
                    flag = false;
                    break;
                }
            }
        }

        if(!flag || !stack.isEmpty()) {
            // 잘못된 괄호열, 아직 stack 에 값이 남아 있는 경우는
            // 잘못된 경우이므로 무조건 0을 출력
            System.out.println(0);
        }else {
            // 이외의 상황은 검증된 상황 -> 구한 답 출력
            System.out.println(answer);
        }
    }
}