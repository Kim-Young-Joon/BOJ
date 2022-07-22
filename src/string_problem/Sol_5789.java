package string_problem;

import java.util.Scanner;

// 한다 안한다
public class Sol_5789 {
    static String solution(String str) {
        int mid = str.length() / 2;
        if((String.valueOf(str.charAt(mid))).equals(String.valueOf(str.charAt(mid-1))))
            return "Do-it";
        else
            return "Do-it-Not";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            String str = sc.next();
            System.out.println(solution(str));
        }
    }
}
