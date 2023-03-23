package inflearn_alg.dp;

// 가장 높은 탑 쌓기 (LIS 응용)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int s, h, w;

    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brick o) {
        return o.s - this.s; // 넓이에 의해서 내림차순 정렬
    }
}

public class Sol_DP_4 {
    static int[] dy;

    public static int solution(ArrayList<Brick> arr) {
        int answer = 0;
        Collections.sort(arr);

        // 초기 작업 (직관적으로 알 수 있는 하나의 값을 지정)
        dy[0] = arr.get(0).h;
        answer = dy[0];

        // 반복
        for (int i = 1; i < arr.size(); i++) {
            int maxH = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > maxH) maxH = dy[j];
            }
            dy[i] = maxH + arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            arr.add(new Brick(a, b, c));
        }

        System.out.println(solution(arr));
    }
}
