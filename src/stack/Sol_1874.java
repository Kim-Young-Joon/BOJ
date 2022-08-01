package stack;

import java.util.Scanner;
import java.util.Stack;

// 스택 수열
public class Sol_1874 {
    static String solution(int[] target) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for(int i = 1; i <= target.length; i++) {
            if(i == target[index]) {
                sb.append("+\n").append("-\n");
                index++;
                while(true) {
                    if(!stack.isEmpty() && stack.peek() == target[index]) {
                        sb.append("-\n");
                        stack.pop();
                        index++;
                    } else break;
                }
            } else {
                sb.append("+\n");
                stack.push(i);
            }
        }

        while(!stack.isEmpty()) {
            if(stack.pop() == target[index]) {
                sb.append("-\n");
                index++;
            } else {
                return "NO";
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] target = new int[len];

        for(int i = 0; i < len; i++) {
            target[i] = sc.nextInt();
        }

        System.out.println(solution(target));
    }
}
