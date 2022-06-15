package implementation;

import java.util.Scanner;

// 방번호
public class Sol_1475 {
    static int N;
    static int[] numbers = new int[10];

    static void input() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        N = Integer.parseInt(str);
        for(int i = 0; i < len; i++) {
            int num = N % 10;
            numbers[num]++;
            N /= 10;
        }
    }

    static void solution() {
        int minSet = 0;

        for(int i = 0; i < numbers.length; i++) {
            if(i == 6 || i == 9) {
                int temp = numbers[6] + numbers[9];
                temp = (int)Math.ceil((double)temp / 2 );

                if(temp > minSet) {
                    minSet = temp;
                }
            } else {
                if(numbers[i] > minSet) {
                    minSet = numbers[i];
                }
            }
        }
        System.out.println(minSet);
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
