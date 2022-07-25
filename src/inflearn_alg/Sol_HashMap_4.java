package inflearn_alg;

import java.util.HashMap;
import java.util.Scanner;

// 모든 아나그램 찾기
public class Sol_HashMap_4 {
    static int solution(String str1, String str2) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        for(char x : str2.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        int len = str2.length() - 1;
        for(int i = 0; i < len; i++) {
            am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int rt = len; rt < str1.length(); rt++) {
            am.put(str1.charAt(rt), am.getOrDefault(str1.charAt(rt), 0) + 1);
            if(am.equals(bm)) answer++;
            am.put(str1.charAt(lt), am.get(str1.charAt(lt)) - 1);
            if(am.get(str1.charAt(lt)) == 0)
                am.remove(str1.charAt(lt));
            lt++;
        }

        return  answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(solution(str1, str2));
    }
}
