package string_problem;

import java.util.Scanner;

// 크로아티아 알파벳
public class Sol_2941 {
    static void solution(String str) {
        int answer = 0;

        for(int i = 0; i < str.length() - 1; i++) {
            char ch = str.charAt(i);
            if(ch == 'c') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') { // c=
                        i++;
                    } else if(str.charAt(i + 1) == '-') {   // c-
                        i++;
                    }
                }
            } else if(ch == 'd') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'z') {
                        if(i < str.length() - 2) {
                            if(str.charAt(i + 2) == '=') {  // dz=
                                i += 2;
                            }
                        }
                    } else if(str.charAt(i + 1) == '-') {   // d-
                        i++;
                    }
                }
            } else if(ch == 'l') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {  // lj
                        i++;
                    }
                }
            } else if(ch == 'n') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == 'j') {	// nj
                        i++;
                    }
                }
            } else if(ch == 's') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// s=
                        i++;
                    }
                }
            } else if(ch == 'z') {
                if(i < str.length() - 1) {
                    if(str.charAt(i + 1) == '=') {	// z=
                        i++;
                    }
                }
            }
            answer++;
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}
