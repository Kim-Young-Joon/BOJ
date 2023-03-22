package inflearn_alg.greedy;

// 친구인가? (Disjoint-Set : Union & Find, 서로소 집합)

import java.util.Scanner;

public class Sol_Greedy_6 {
    static int[] unf; // 집합 표현

    public static int Find(int v) {
        // 친구 관계 확인을 위한 함수
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        // 친구 관계로 맺어주기 위한 함수
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];

        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a, b);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = Find(a);
        int fb = Find(b);

        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
