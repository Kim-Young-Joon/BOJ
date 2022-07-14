package sorting;

import java.util.HashSet;
import java.util.Scanner;

// 숫자카드
public class Sol_10815 {
    static HashSet<Integer> data = new HashSet<>();

    static void solution(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(data.contains(arr[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        for(int i = 0; i < len; i++) {
            data.add(sc.nextInt());
        }

        len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}
