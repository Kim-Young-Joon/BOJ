package inflearn_alg;

import java.util.Scanner;

// 문장 속 단어 : split, substring()
public class Sol_String_3 {
    static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }

        /*
            str.substring(x, y) : str 문자열을 x 부터 y-1 까지 잘라서 새로운 문자열로 리턴
            str.indexOf(' ') : str 문자열의 공백 위치를 리턴, 없을 경우 -1 리턴
        int pos;
        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length() > m) answer = str;
        */
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
