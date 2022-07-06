package string_problem;

import java.util.Scanner;

// 문서 검색
public class Sol_1543 {
    static int solution(String str, String target) {
        int answer = 0;
        int start = 0, len = target.length();

        for(int i = 0; i < str.length() - len + 1; i++) {
            if(target.equals(str.substring(i, i+len))) {
                i += len-1;
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String target = sc.nextLine();
        System.out.println(solution(str, target));
    }
}
