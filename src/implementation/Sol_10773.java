package implementation;

import java.util.ArrayList;
import java.util.Scanner;

// 제로
public class Sol_10773 {
    static int N;
    static int[] num;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        num = new int[N];

        for(int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
    }

    static void solution() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < N; i++) {
            if(num[i] != 0) {
                numbers.add(num[i]);
            } else {
                numbers.remove(numbers.size() - 1);
            }
        }

        for(int value : numbers) {
            sum += value;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
