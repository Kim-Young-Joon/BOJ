package inflearn_alg.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 교육과정 설계
public class Sol_Queue_2 {
    static String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char c : need.toCharArray()) Q.offer(c);
        for(char x : plan.toCharArray()) {
            if(Q.contains(x)) {
                if(x != Q.poll()) return "NO";
            }
        }
        if(!Q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a, b));
    }
}
