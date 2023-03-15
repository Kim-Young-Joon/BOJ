package inflearn_alg.dfs_bfs;

// 미로 탐색

import java.util.Scanner;

public class Sol_DFS_10 {
    // dx, dy 를 통해서 x, y 값의 변화에 따른 방향을 의미
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public static void DFS(int x, int y) {
        if (x == 7 && y == 7) answer++;
        else {
            for (int i = 0; i < 4; i++) { // 방향 설정
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) { // 갈 수 있는지 확인
                    board[nx][ny] = 1; // 이동 했다고 표시 남겨둠
                    DFS(nx, ny);
                    board[nx][ny] = 0; // 다른 경로를 확인하기 위해서 기존의 값으로 다시 변경하고 돌아감
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8]; // 0번 인덱스가 아닌 1번 인덱스부터 사용하기 위해서 +1 함
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1; // 출발점 체크
        DFS(1, 1);
        System.out.println(answer);
    }
}
