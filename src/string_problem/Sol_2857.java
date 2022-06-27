package string_problem;

import java.util.Scanner;

// FBI
public class Sol_2857 {
    static String[] members = new String[5];

    static void input() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < members.length; i++) {
            members[i] = sc.next();
        }
    }

    static void solution() {
        int index = 1;
        int cnt = 0;

        for(int i = 0; i < members.length; i++) {
            if(members[i].contains("FBI")) {
                System.out.print(index + " ");
                cnt++;
            }
            index++;
        }

        if(cnt == 0) {
            System.out.println("HE GOT AWAY!");
        }
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
