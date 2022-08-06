package string_problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 무한 문자열
public class Sol_12871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        String str1 = s;
        String str2 = t;

        if(s.length() != t.length()) {
            int len = LCM(s.length(), t.length());

            while(str1.length() != len) {
                str1 += s;
            }

            while(str2.length() != len) {
                str2 += t;
            }
        }

        if(str1.equals(str2)) System.out.print(1);
        else System.out.print(0);

    }

    static int GCD(int a, int b) {
        while(b > 0) {
            int temp = a;
            a = b;
            b = temp%b;
        }
        return a;
    }

    static int LCM(int a, int b) {
        return (a*b)/GCD(a, b);
    }
}
