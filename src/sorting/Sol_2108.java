package sorting;

import java.util.Scanner;

// 통계학
public class Sol_2108 {
    static int N;
    static int[] arr;
    static int sum, max, min, median, mode;


    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        arr = new int[8001]; // 입력값 범위 : -4000 ~ 4000
        sum = 0;
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        median = 5000;
        mode = 5000;

        for(int i = 0; i < N; i++) {
            int value = sc.nextInt();
            sum += value;
            arr[value + 4000]++;
            if(max < value) {
                max = value;
            }
            if(min > value) {
                min = value;
            }
        }
    }

    static void solution() {
        int count = 0;	// 중앙값 빈도 누적 수
        int mode_max = 0; 	// 최빈값의 최댓값
        boolean flag = false;

        for(int i = min + 4000; i <= max + 4000; i++) {
            if(arr[i] > 0) {
                if(count < (N + 1) / 2) {
                    count += arr[i];
                    median = i - 4000;
                }

                if(mode_max < arr[i]) {
                    mode_max = arr[i];
                    mode = i - 4000;
                    flag = true;
                } else if(mode_max == arr[i] && flag == true) {
                    mode = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum / N));	// 산술평균
        System.out.println(median);	// 중앙값
        System.out.println(mode);	// 최빈값
        System.out.println(max - min);	// 범위
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
