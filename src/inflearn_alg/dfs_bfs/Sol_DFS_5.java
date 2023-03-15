package inflearn_alg.dfs_bfs;

// 동전 교환

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sol_DFS_5 {
    static int n, m, answer = Integer.MAX_VALUE;

    public static void DFS(int L, int sum, Integer[] arr) {
        if(sum > m) return;
        if(L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n]; // Collections.reverseOrder() 사용을 위해 객체형으로 선언
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
        m = sc.nextInt();
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
