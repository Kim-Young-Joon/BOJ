package inflearn_alg;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 공주 구하기
public class Sol_Queue_1 {
    static int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i = 1; i <= n; i++) Q.offer(i);
        while(!Q.isEmpty()) {
            for(int i = 1; i < k; i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size() == 1) answer = Q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solution(n, k));
    }
}
