package inflearn_alg.dfs_bfs;

// 피자 배달 거리 : 삼성 SW 역량평가 기출

import java.util.ArrayList;
import java.util.Scanner;

class Point_a {
    // 좌표 정보 저장을 위한 클래스
    public int x, y;
    Point_a(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Sol_DFS_12 {
    // n : 도시 크기, m : 피자집 개수, len : 피자집 개수, answer : 도시의 피자 배달 거리의 최소값
    static int n, m, len, answer = Integer.MAX_VALUE;

    // combi : 조합 저장
    static int[] combi;

    // pz : 피자집의 좌표들을 저장, hs : 집의 좌표를 모두 저장
    static ArrayList<Point_a> pz, hs;

    public static void DFS(int L, int s) {
        // 조합 경우의 수
        if (L == m) { // 하나의 조합이 완성되는 경우
            int sum = 0;
            for (Point_a h : hs) { // 각 집별로 선정된 피자집과의 최소 거리 구하기
                int dis = Integer.MAX_VALUE;
                for (int i : combi) { // 조합에 선정된 피자집과 집과의 거리 확인
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        // 피자집 선택 (조합)
        // 각 피자집과 집집마다 거리의 최소 거리 구하기
        // 각 집별로 가까운 피자집과의 거리 합하기 (도시의 피자 배달 거리)
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) hs.add(new Point_a(i, j));
                else if (tmp == 2) pz.add(new Point_a(i, j));
            }
        }

        len = pz.size();
        combi = new int[m];
        DFS(0, 0);
        System.out.println(answer);
    }
}
