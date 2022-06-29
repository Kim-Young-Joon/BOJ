package inflearn_alg;

import java.util.Scanner;

// 중복문자 제거 : indexOf() 메서드 활용 (먼저 찾아지는 인덱스를 반환한다는 점 이용)
public class Sol_String_6 {
    static String solution(String str) {
        String answer = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i); // 같지 않은 경우는 중복된 문자이다.
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
