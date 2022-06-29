package inflearn_alg;

import java.util.Scanner;

// 특정 문자 뒤집기 : 인덱스 값을 이용한 구현
public class Sol_String_5 {
    static String solution(String str) {
        String answer="";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt) {
            if(!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if(!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
