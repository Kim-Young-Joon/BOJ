package inflearn_alg.string;

import java.util.Scanner;

// 암호
public class Sol_String_12 {
    static String solution(int len, String str) {
        String answer = "";
        String[] secret = new String[len];

        for(int i = 0; i < len; i++) { // 7자리씩 끊어서 저장
            secret[i] = str.substring(i * 7, (i+1)*7);
        }

        for(String s : secret) { // 각 자리별 문자 변환
            answer += transChar(s);
        }

        return answer;
    }

    static char transChar(String s) {
        int num = 0, index = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(index) == '#') {
                num += Math.pow(2, i);
            }
            index++;
        }

        return (char)num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(len, str));
    }
}
