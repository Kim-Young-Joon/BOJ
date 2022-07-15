package sorting;

import java.util.Arrays;
import java.util.Scanner;

// ATM
public class Sol_11399 {

    static void solution(int len, int[] times) {
        int totalTime = 0;
        Arrays.sort(times);
        for(int i = 0; i < len; i++) {
            totalTime += times[i] * (len - i);
        }
        System.out.println(totalTime);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] times = new int[len];
        for(int i = 0; i < len; i++) {
            times[i] = sc.nextInt();
        }
        solution(len, times);
    }
}
