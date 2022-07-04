package string_problem;

import java.util.Scanner;

// 그릇
public class Sol_7567 {
    static int solution(String str) {
        int answer = 10; // 처음 들어오는 높이는 무조건 10
        char target = str.charAt(0);

        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == target) {
                answer += 5;
            } else {
                target = str.charAt(i);
                answer += 10;
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
