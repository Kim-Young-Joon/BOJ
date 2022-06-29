package inflearn_alg;

import java.util.ArrayList;
import java.util.Scanner;

// 단어 뒤집기 : StringBuilder 클래스의 reverse()
public class Sol_String_4 {
    static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        /* 메서드 사용하지 않고 직접 구현하기 - 시작 인덱스와 끝 인덱스로 데이터 다루기
        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        */

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(String x : solution(n, str)) {
            System.out.println(x);
        }
    }
}
