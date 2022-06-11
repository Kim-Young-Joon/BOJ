package brute_force;

import java.util.Scanner;

// 문자열
public class Sol_1120 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        int result = a.length();

        for(int i=0;i<b.length()-a.length()+1;i++) {
            int tmp=0;

            for(int j=0;j<a.length();j++) {
                if(a.charAt(j)!=b.charAt(j+i)) {
                    tmp++;
                }
            }
            if(result > tmp){
                result = tmp;
            }
        }

        System.out.println(result);
    }
}