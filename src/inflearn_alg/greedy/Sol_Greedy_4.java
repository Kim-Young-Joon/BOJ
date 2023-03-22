package inflearn_alg.greedy;

// 최대 수입 스케줄

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    int money;
    int date;
    Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    @Override
    public int compareTo(Lecture ob) { // 큰 값부터 정렬되게 함
        return ob.date - this.date;
    }
}

public class Sol_Greedy_4 {
    static int n, max = Integer.MIN_VALUE;

    public static int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);

        int j = 0;
        for (int i = max; i >= 1; i--) { // 기한이 가장 많이 남은 강의부터 하루씩 줄어들며 탐색
            for (; j < n; j++) {
                if (arr.get(j).date < i) break; // 남아 있는 기한보다 더 많은 기한의 강의를 선택하기 위함
                pQ.offer(arr.get(j).money);
            }
            if (!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));

            if (d > max) max = d;
        }

        System.out.println(solution(arr));
    }
}
