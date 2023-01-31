package inflearn_alg.basic_DFS_BFS;

// 송아지 찾기

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol_BFS_1 {
    // static int answer = 0; // 최소 횟수
    static int[] dis = {1, -1, 5}; // 증감 가능 칸 수
    static int[] ch; // 체크 배열 (한번 큐에 들어간 것은 다시 넣지 않게 하기 위함, 시간 복잡도 감소)
    // 방문한 좌표의 경우 이 배열의 해당 index 의 값을 1로 변경해 주면서 방문했다는 표시를 남김
    static Queue<Integer> queue = new LinkedList<>();

    public static int BFS(int s, int e) {
        ch = new int[10001]; // index 가 10,000까지 있어야 함
        ch[s] = 1;
        queue.offer(s);
        int level = 0; // tree 의 level (이동 횟수와 동일)

        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int x = queue.poll();

                // sol 1. 찾고자 하는 좌표 값이 있는 곳까지 이동한 다음, 찾은 경우 return
                // if (x == e) return level; // 가고자 하는 좌표의 값과 동일하다면, 해당 level 을 return

                for (int j = 0; j < 3; j++) { // dis 배열을 통해 이동 가능한 칸으로 이동
                    int child = x + dis[j];

                    // sol 2. 부모 노드에서 자식 노드를 확인하고, 자식 노드 중에서 찾고자 하는 좌표 값이 있다면, 부모 level +1 한 값을 return
                    if (child == e) return level + 1; // 가고자 하는 좌표의 값과 동일하다면, 해당 level 을 return

                    if (child >= 1 && child <= 10000 && ch[child] == 0) {
                        ch[child] = 1; // 방문한 좌표의 경우 값을 1로 변경시켜줌
                        queue.offer(child);
                    }
                }
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // 출발점
        int e = sc.nextInt(); // 송아지의 위치
        System.out.println(BFS(s, e));
    }
}
