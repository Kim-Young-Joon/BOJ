package inflearn_alg.dfs_bfs;

// 섬나라 아일랜드

import java.util.Scanner;

public class Sol_DFS_11 {
    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public static void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            // 8개의 방향으로 이동하기 위함
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0; // 바다로 변경
                DFS(nx, ny, board);
            }
        }
    }

    public static void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    board[i][j] = 0; // 최초 출발점을 바다로 변경
                    DFS(i, j, board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);
    }
}
