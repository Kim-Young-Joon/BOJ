package inflearn_alg.sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

// 마구간 정하기
public class Sol_Sorting_10 {
    static int count(int[] arr, int dist) {
        int cnt = 1; // 배치한 말의 마리수
        int ep = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - ep >= dist) {
                // 가장 가까운 말의 거리보다 크거나 같으면,
                cnt++; // 배치하는 말의 마리수를 늘리고
                ep = arr[i]; // end position 을 변경한다
            }
        }

        return cnt;
    }

    static int solution(int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, c, arr));
    }
}
