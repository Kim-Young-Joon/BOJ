package inflearn_alg.array;

import java.util.Scanner;

// 보이는 학생
public class Sol_Array_2 {
    static int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];
        for(int i=1; i < n; i++) {
            if(arr[i] > max) {
                answer++;
                max = arr[i];
            }
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
        System.out.println(solution(n, arr));
    }
}
