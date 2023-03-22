package inflearn_alg.greedy;

// 원더랜드 (최소 스패닝 트리 : 프림, Priority Queue)

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class MyEdge implements Comparable<MyEdge> {
    public int vex;
    public int cost;
    MyEdge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(MyEdge ob) {
        return this.cost - ob.cost;
    }
}

public class Sol_Greedy_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<MyEdge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            graph.get(a).add(new MyEdge(b, c));
            graph.get(b).add(new MyEdge(a, c));
        }

        int answer = 0;
        PriorityQueue<MyEdge> pQ = new PriorityQueue<>();
        pQ.offer(new MyEdge(1, 0));
        while (!pQ.isEmpty()) {
            MyEdge tmp = pQ.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (MyEdge ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) pQ.offer(new MyEdge(ob.vex, ob.cost));
                }
            }
        }

        System.out.println(answer);
    }
}