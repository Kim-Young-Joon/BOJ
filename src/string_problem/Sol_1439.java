package string_problem;

import java.util.Scanner;

// 뒤집기
public class Sol_1439 {
    static int solution(String str) {
        int answer = 0;
        char c = str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            if(c != str.charAt(i)) {
                if(str.charAt(i) != str.charAt(i - 1)) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
