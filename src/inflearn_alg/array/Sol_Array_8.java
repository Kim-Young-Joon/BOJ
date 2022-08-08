package inflearn_alg.array;

import java.util.Scanner;

// 등수 구하기
public class Sol_Array_8 {
    static int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            int cnt = 1;
            for(int j = 0; j < n; j++) {
                if(arr[j] > arr[i]) cnt++;
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
