package implementation;

import java.util.Scanner;

// 단어의 개수
public class Sol_1152 {
    static String str;

    static void input() {
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
    }

    static void solution() {
        String[] myData = str.split(" ");
        int cnt = 0;

        for(int i = 0; i < myData.length; i++) {
            if(myData[i].equals("")) {
                continue;
            } else {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
