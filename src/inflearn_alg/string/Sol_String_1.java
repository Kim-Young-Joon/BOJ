package inflearn_alg.string;

import java.util.Scanner;

// 문자 찾기
public class Sol_String_1 {
    static int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
    /*
    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == t)
        answer++;
    }
    */
        for(char x : str.toCharArray()) {
            if(x == t)
                answer++;
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));
    }
}
