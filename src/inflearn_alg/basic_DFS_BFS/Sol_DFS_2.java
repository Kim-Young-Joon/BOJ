package inflearn_alg.basic_DFS_BFS;

// 경로 탐색 (인접 리스트)

import java.util.ArrayList;
import java.util.Scanner;

public class Sol_DFS_2 {
    static int answer = 0;
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    static void DFS(int v) {
        if(v == n) answer++;
        else {
            for (int next : graph.get(v)) {
                if (ch[next] == 0) {
                    ch[next] = 1;
                    DFS(next);
                    ch[next] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }
}
