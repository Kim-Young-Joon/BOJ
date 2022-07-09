package inflearn_alg;

import java.util.Scanner;

// 피보나치 수열
public class Sol_Array_4 {
    static int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i = 2; i < n; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer;
    }

    /* 배열사용하지 않고 해보기
    static void solution(int n) {
        int a = 1, b = 1, c;
        System.out.println(a+ " " + b + " ");
        for(int i = 2; i < n; i++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;
        }
    }
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : solution(n)) System.out.print(x + " ");
    }
}
