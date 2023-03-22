package inflearn_alg.greedy;

// 결혼식

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time_3 implements Comparable<Time_3> {
    int time;
    char state;
    Time_3(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Time_3 ob) {
        if (this.time == ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}

public class Sol_Greedy_3 {
    public static int solution(ArrayList<Time_3> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0; // 특정 시간에 몇 명의 사람이 있는가

        for (Time_3 ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time_3> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int sT = sc.nextInt();
            int eT = sc.nextInt();

            arr.add(new Time_3(sT, 's'));
            arr.add(new Time_3(eT, 'e'));
        }

        System.out.println(solution(arr));
    }
}
