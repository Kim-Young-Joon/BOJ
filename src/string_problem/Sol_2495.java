package string_problem;

import java.util.Scanner;

// 연속 구간
public class Sol_2495 {
    static int[] solution(String[] numbers) {
        int[] answer = new int[3];
        for(int j = 0; j < 3; j++) {
            String num = numbers[j];
            int max = 1;
            int cnt = 1;
            for(int i = 1; i < num.length(); i++) {
                if(num.charAt(i) == num.charAt(i-1)) {
                    cnt++;
                } else {
                    cnt = 1;
                }

                if(max < cnt) {
                    max = cnt;
                }
            }
            answer[j] = max;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = new String[3];
        for(int i = 0; i < 3; i++) {
            numbers[i] = sc.next();
        }
        for(int x : solution(numbers)) {
            System.out.println(x);
        }
    }
}
