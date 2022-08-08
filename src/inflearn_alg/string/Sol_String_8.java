package inflearn_alg.string;

import java.util.Scanner;

// 유효한 팰린드롬
// replace()에는 정규식 사용 불가, replaceAll() 에는 정규식 사용 가능
public class Sol_String_8 {
    static String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(s).reverse().toString();
        if(s.equals(temp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str = sc. nextLine();
        System.out.println(solution(str));
    }
}
