package implementation;

import java.util.Scanner;

// ROT13
public class Sol_11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] rot13 = sc.nextLine().toCharArray();

        for (int i = 0; i < rot13.length; i++) {
            if (rot13[i] >= 'A' && rot13[i] <= 'Z') {
                if (rot13[i] >= 'N') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            } else if (rot13[i] >= 'a' && rot13[i] <= 'z') {
                if (rot13[i] >= 'n') {
                    rot13[i] -= 13;
                } else {
                    rot13[i] += 13;
                }
            }
        }

        for (char i : rot13) sb.append(i);

        System.out.println(sb);
    }
}
