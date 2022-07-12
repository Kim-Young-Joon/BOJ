package string_problem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 단어 정렬
public class Sol_1181 {
    static String[] words;

    static void solution() {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!words[i].equals(words[i - 1])) {
                System.out.println(words[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        words = new String[len];
        for(int i = 0; i < len; i++) {
            words[i] = sc.next();
        }
        solution();
    }
}
