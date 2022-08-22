package inflearn_alg.sorting_searching;

import java.util.Arrays;
import java.util.Scanner;

// 뮤직 비디오(결정 알고리즘)
public class Sol_Sorting_9 {
    static int count(int[] arr, int capacity) {
        int cnt = 1; // DVD 장 수
        int sum = 0;
        for(int x : arr) {
            if(sum + x > capacity) {
                cnt++;
                sum = x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    static int solution(int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt(); // 반복하며 최대값 구하기
        int rt = Arrays.stream(arr).sum(); // 모든 요소의 합 구하기
        while(lt <= rt) {
            int mid = (lt + rt) / 2;
            if(count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(solution(n, m, arr));
    }
}
