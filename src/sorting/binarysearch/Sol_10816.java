package sorting.binarysearch;

import java.util.HashMap;
import java.util.Scanner;

// 숫자 카드 2
public class Sol_10816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 보유하고 있는 숫자 파악
        HashMap<Integer, Integer> myNum = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            myNum.put(num, myNum.getOrDefault(num, 0) + 1);
        }

        // 확인할 숫자
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder(); // 출력

        for (int i = 0; i < m; i++) {
            int number = sc.nextInt();
            sb.append(myNum.getOrDefault(number, 0)).append(' ');
        }
        System.out.println(sb);
    }
}
