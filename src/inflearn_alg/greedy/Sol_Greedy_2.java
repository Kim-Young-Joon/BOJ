package inflearn_alg.greedy;

// 회의실 배정

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

// 먼저 끝나는 순서대로 회의를 진행하면 최대한 많은 회의를 할 수 있다. (Greedy)
// 먼저 시작하는 것 기준으로 하다보면, 최대 값을 구할 수 없음
// 따라서 회의가 끝나는 시간을 기준으로 정렬하고, 선택한다.
// 주의할 점은 회의의 시작시간과 끝나는 시간이 동일할 수 있으므로, 만약 끝나는 시간이 동일하다면 시작시간을 기준으로도 정렬해야 함

public class Sol_Greedy_2 {
    public static int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0; // 회의가 끝나는 시간

        for (Time ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new Time(x, y));
        }
        System.out.println(solution(arr, n));
    }
}
