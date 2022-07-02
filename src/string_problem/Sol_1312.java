package string_problem;

import java.util.Scanner;

// 소수
public class Sol_1312 {
    static void solution(int num1, int num2, int digit) {
        // double 형은 정확하게 표현 할 수 없기 때문에 아래와 같은 방법으로 품
        // 나누기 하는 과정에서 정수부분에 대한 값은 필요 없으므로
        int result = num1 % num2; // 정수 영역에서의 나머지를 구하고

        for (int i = 0; i < digit-1; i++) { // 그 나머지의 10을 곱해서 다음자리 나머지를 구한다.
            // 이 작업을 원하는 자리수까지 반복
            result *= 10;
            result %= num2;
        }
        result *= 10;

        // 원하는 자리수에서는 계속 진행할 것이 아니기 때문에 나누기를 하여 몫을 구한다.
        System.out.println(result/num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        solution(A, B, N);
    }
}
