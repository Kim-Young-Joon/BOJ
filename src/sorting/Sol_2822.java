package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

// 점수 계산
public class Sol_2822 {
    static void solution(HashMap<Integer, Integer> indexNum, ArrayList<Integer> numbers) {
        int total = 0; // 총점
        ArrayList<Integer> index = new ArrayList<>(); // 최종 점수에 포함되는 index 저장 배열

        Collections.sort(numbers);

        for (int i = 7; i > 2; i--) {
            int num = numbers.get(i);
            total += num;
            index.add(indexNum.get(num));
        }

        Collections.sort(index);

        System.out.println(total);
        for (int i : index) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // index 를 가지고 있을 HashMap data
        HashMap<Integer, Integer> indexNum = new HashMap<>();
        // 정렬을 위한 ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // 항상 8개의 문제에 대한 점수를 입력 받음
        for(int i = 1; i <= 8; i++) {
            int num = sc.nextInt();
            indexNum.put(num, i);
            numbers.add(num);
        }

        solution(indexNum, numbers);
    }
}
