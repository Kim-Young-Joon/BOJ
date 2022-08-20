package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

// 중복 빼고 정렬하기
public class Sol_10867 {
    static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> dupNum = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(!dupNum.contains(arr[i])) {
                dupNum.add(arr[i]);
                answer.add(arr[i]);
            }
        }
        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) arr[i] = sc.nextInt();
        for(int num : solution(arr)) System.out.print(num + " ");
    }
}
