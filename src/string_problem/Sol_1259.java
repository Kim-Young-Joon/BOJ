package string_problem;

import java.util.Scanner;

// 팰린드롬수
public class Sol_1259 {
    static String S;

    static void input() {
        Scanner sc = new Scanner(System.in);
        S = sc.next();

        while(!S.equals("0")) {
            output();
            S = sc.next();
        }
    }

    static void output() {
        if(isPalindrome(S)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static boolean isPalindrome(String str1) {
        StringBuilder sb = new StringBuilder(str1);
        String str2 = sb.reverse().toString();

        if(str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        input();
    }
}
