package implementation;

import java.util.Scanner;

// 피시방 알바
public class Sol_1453 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        boolean[] arr = new boolean[101];

        int backCount = 0;

        for (int i = 0; i < num; i++) {
            int request = sc.nextInt();
            if (arr[request] == true) {
                backCount++;
            } else {
                arr[request] = true;
            }
        }

        System.out.println(backCount);
    }
}
