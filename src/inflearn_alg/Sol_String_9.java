package inflearn_alg;

import java.util.Scanner;

// 숫자만 추출
// 자리수 맞추는 로직을 다시 한번 확인
public class Sol_String_9 {
    static int solution(String s) {
        int answer = 0;
        for(char c : s.toCharArray()) {
            if(c >=48 && c <= 57) {
                answer = answer * 10 + (c - 48);
            }
        }
        return answer;

        // isDigit() : 매개변수로 들어오는 문자가 숫자이면 true
        /*
        String answer = "";
        for(char x : s.toCharArray()) {
          if(Character.isDigit(x)) answer += x;
        }
        return Integer.parseInt(answer);
        */
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
