package brute_force;

import java.util.Scanner;

public class test {
    static String solution(String str) {
        String answer = "";
        /*
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        */
        /*
            ASCII code를 이용한 풀이
            1. 대문자 : 65 ~ 90
            2. 소문자 : 97 ~ 122
         */
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
