package inflearn_alg.basic_DFS_BFS;

// 경로 탐색 (인접 행렬)

import java.util.Scanner;

public class Sol_DFS_1 {
    static int answer = 0; // 이동 가능한 경로의 수
    static int n, m; // n : 노드의 수, m : 간선의 수
    static int[][] graph; // 노드간 이동이 가능한지 나타내는 배열
    static int[] ch; // 이미 이동한 노드인지 확인하는 배열

    public static void DFS(int v) {
        if (v == n) answer++; // 도착지와 동일하면 가능한 경로의 숫자를 증가
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 백트레킹을 할 때에는 다시 0으로 초기화 해줘야 함
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        ch = new int[n + 1];

        for (int i = 0; i < m; i++) {
            // 간선에 대한 정보를 저장
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1; // 시작점이 되는 1번 노드를 체크
        DFS(1);
        System.out.println(answer);
    }
}
