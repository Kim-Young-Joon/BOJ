package inflearn_alg;

import java.util.Scanner;

// 문자열 압축
public class Sol_String_11 {
    static String solution(String str) {
        String answer = "";
        str += " "; // 빈 문자 하나 넣어서 인덱스 오류 안나게 조치

        int cnt = 1;
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer += str.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }

        return  answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
