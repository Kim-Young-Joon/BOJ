package inflearn_alg.string;

import java.util.Scanner;

// 회문 문자열
public class Sol_String_7 {
    static String solution(String str) {
        String answer = "YES";

        // 방법 1
        int len = str.length();
        str = str.toUpperCase();
        for(int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1))
                return "NO";
        }
        return answer;

        // 방법 2
        /*
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer = "YES";
        return answer;
         */
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
