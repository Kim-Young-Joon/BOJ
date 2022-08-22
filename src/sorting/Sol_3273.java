package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 두 수의 합
public class Sol_3273 {
    static int solution(ArrayList<Integer> numbers, int target) {
        int answer = 0;
        int lt = 0;
        int rt = numbers.size() - 1;
        Collections.sort(numbers);

        while(lt < rt) {
            int num = numbers.get(lt) + numbers.get(rt);
            if(num == target) {
                answer++;
            }

            if(num <= target) {
                lt++;
            } else {
                rt--;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        int target = sc.nextInt();
        System.out.println(solution(numbers, target));
    }
}
/*
1 2 3 5 7 9 10 11 12
 13
 */