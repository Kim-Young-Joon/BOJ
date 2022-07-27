package two_pointer;

import java.util.Scanner;

// 부분합
public class Sol_1806 {
    static int solution(int target, int[] numbers) {
        int answer = 100000;
        int lt = 0, rt = 0, sum = 0;

        while(true) {
            if(sum >= target) {
                sum -= numbers[lt];
                answer = Math.min(answer, rt-lt);
                lt++;
            } else if(rt == numbers.length) {
                break;
            } else {
                sum += numbers[rt];
                rt++;
            }
        }

        if(answer == 100000) return 0;

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int target = sc.nextInt();
        int[] numbers = new int[len];
        for(int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(solution(target, numbers));
    }
}
