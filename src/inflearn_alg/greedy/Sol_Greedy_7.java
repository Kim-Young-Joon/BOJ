package inflearn_alg.greedy;

// 원더랜드 (최소 스패닝 트리 : 크루스칼, Union & Find 활용)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edges implements Comparable<Edges> {
    public int v1;
    public int v2;
    public int cost;

    Edges(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edges ob) {
        return this.cost - ob.cost; // 오름차순 정렬
    }
}

public class Sol_Greedy_7 {
    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);

        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        ArrayList<Edges> arr = new ArrayList<>();

        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            arr.add(new Edges(a, b, c));
        }

        int answer = 0;
        Collections.sort(arr);

        for (Edges ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1 != fv2) {
                answer += ob.cost;
                Union(ob.v1, ob.v2);
            }
        }


        System.out.println(answer);
    }
}
