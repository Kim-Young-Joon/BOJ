package string_problem;

import java.util.Arrays;
import java.util.Scanner;

// 30
public class Sol_10610 {
    static String N;
    static int[] numbers;

    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.next();
        // 30의 배수는 3의 배수이면서, 1의 자리 수가 0인 수이다.
        // 3의 배수는 모든 자리의 수의 합이 3의 배수이면 된다.
        numbers = new int[N.length()];
    }

    static void solution() {
        // 입력받은 수에 0이 없다면 30의 배수로 만들수 없다.
        if(! isMultiple()) {
            System.out.println(-1);
        } else {
            maxNum();
        }
    }

    static boolean isMultiple() { // 수가 3의 배수인지, 0은 있는지 확인
        int sum = 0;
        boolean answer = false;

        for(int i = 0; i < N.length(); i++) {
            numbers[i] = Integer.parseInt(N.charAt(i)+"");
            sum += numbers[i];
            if(numbers[i] == 0) {
                answer = true;
            }
        }

        if(sum % 3 != 0) {
            answer = false;
        }

        return answer;
    }

    static void maxNum() {
        Arrays.sort(numbers);
        for(int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i]);
        }
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
