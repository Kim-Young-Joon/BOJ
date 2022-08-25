package string_problem;

import java.util.HashSet;
import java.util.Scanner;

// 문자열 집합
public class Sol_14425 {
    static int solution(HashSet<String> set, String[] arr) {
        int answer = 0;

        for (String s : arr) {
            if (set.contains(s)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        String[] testArr = new String[m];

        for (int i = 0; i < n; i++) {
            set.add(sc.next());
        }

        for (int i = 0; i < m; i++) {
            testArr[i] = sc.next();
        }

        System.out.println(solution(set, testArr));
    }
}
