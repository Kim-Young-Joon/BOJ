package dfs_bfs;

// 영역 구하기 (DFS)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sol_2583 {
    static int M, N, K; // 모눈종이의 가로, 모눈종이의 세로, 직사각형의 개수
    static List<Integer> section = new ArrayList<>(); // 나눠진 영역별 너비
    static int[][] map; // 모눈종이
    static int area = 0; // 영역의 넓이

    // 이동하기 위한 증감
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        map = new int[M][N];

        for (int i = 0; i < K; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int x = y1; x < y2; x++) {
                for (int y = x1; y < x2; y++) {
                    map[x][y] = 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 0) {
                    area = 0;
                    solution(i, j);
                    section.add(area);
                }
            }
        }

        System.out.println(section.size()); // 나눠진 영역의 개수

        Collections.sort(section);

        for (int a : section) System.out.print(a + " ");
    }

    public static void solution(int x, int y) {
        map[x][y] = 1;
        area++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && ny >= 0 && nx < M && ny < N && map[nx][ny] == 0) solution(nx, ny);
        }
    }
}
