package sorting.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

// 수 찾기
public class Sol_1920 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int M = in.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++) {
            if(binarySearch(arr, in.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key) {
        int lt= 0;
        int rt = arr.length - 1;

        while(lt <= rt) {
            int mid = (lt + rt) / 2;

            if(key < arr[mid]) {
                rt = mid - 1;
            } else if(key > arr[mid]) {
                lt = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
