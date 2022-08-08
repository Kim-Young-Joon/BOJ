package inflearn_alg.array;

import java.util.ArrayList;
import java.util.Scanner;

// 큰 수 출력하기
public class Sol_Array_1 {
    static ArrayList<Integer> solution(int len, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

        for(int i = 1; i < len; i++) {
            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        for(int x : solution(len, arr))
            System.out.print(x + " ");
    }
}
