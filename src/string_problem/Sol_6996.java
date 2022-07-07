package string_problem;

import java.util.Arrays;
import java.util.Scanner;

// 애너그램
public class Sol_6996 {
    static void solution(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(Arrays.equals(charArray1, charArray2))
            System.out.println(str1+ " & " +str2+ " are anagrams.");
        else
            System.out.println(str1+ " & " +str2+ " are NOT anagrams.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            solution(str1, str2);
        }
    }
}
