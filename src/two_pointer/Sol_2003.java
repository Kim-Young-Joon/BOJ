package two_pointer;

import java.util.Scanner;

// 수들의 합 2
public class Sol_2003 {
    static int solution(int[] arr, int target) {
        int answer = 0;
        for(int lt = 0; lt < arr.length; lt++) {
            int sum = 0;
            for(int rt = lt; rt < arr.length; rt++) {
                sum += arr[rt];
                if(sum == target) answer++;
                else if(sum > target) break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, target));
    }
}
