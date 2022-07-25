package inflearn_alg;

import java.util.HashMap;
import java.util.Scanner;

// 학급회장
public class Sol_HashMap_1 {
    static char solution(int size, String str) {
        char answer = ' ';
        HashMap<Character, Integer> list = new HashMap<>();
        for(char x : str.toCharArray()) {
            list.put(x, list.getOrDefault(x, 0)+ 1);
        }

        int max = Integer.MIN_VALUE;
        for(char key : list.keySet()) {
            if(list.get(key) > max) {
                max = list.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(size, str));
    }
}
