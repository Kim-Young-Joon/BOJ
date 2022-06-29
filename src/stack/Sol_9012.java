package stack;
import java.util.Scanner;

// 괄호
public class Sol_9012 {
    static String[] bracket;

    static void input() {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        bracket = new String[len];

        for(int i = 0; i < len; i++) {
            bracket[i] = sc.next();
        }
    }

    static void output() {
        StringBuilder sb = new StringBuilder();
        for(String str : bracket) {
            if(VPS(str)) {
                sb.append("YES").append('\n');
            } else {
                sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    static boolean VPS(String str) {
        int cnt = 0;

        for(char c : str.toCharArray()) {
            if(c == '(') {
                cnt++;
            } else if(cnt == 0) {
                return false;
            } else {
                cnt--;
            }
        }

        if(cnt == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        input();
        output();
    }
}
