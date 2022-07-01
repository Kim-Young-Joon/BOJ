package inflearn_alg;

import java.util.Scanner;

// 대소문자 변환
public class Sol_String_2 {
    static String solution(String str) {
        String answer = "";

        for(char x : str.toCharArray()) {
            if(x >= 97 && x <= 122) answer += (char)(x-32);
            else answer += (char)(x+32);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
