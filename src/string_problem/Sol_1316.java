package string_problem;

import java.util.HashMap;
import java.util.Scanner;

// 그룹 단어 체커
public class Sol_1316 {
    /*
        연속되는 문자인가? (이전 문자와 같은 문자인가?)
        같은 문자라면 통과, 다른 문자라면 이전에 나온 적이 있는가?
        이전에 나온 적이 있는 문자라면 그룹 단어가 아님
        문자열의 길이만큼 확인했을 때 문제가 없다면 해당 단어는 그룹 단어
     */

    static int solution(String[] words) {
        int answer = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == 1) {
                answer++;
                continue;
            }

            if(duplicate(words[i])) { // 그룹 단어가 아니라면
                continue; // 다음 문자열을 확인
            } else {
                answer++;
            }
        }

        return answer;
    }

    static boolean duplicate(String str) {
        HashMap<Character, Boolean> check = new HashMap<>(); // 이전에 나온 적이 있는지를 판별할 변수
        check.put(str.charAt(0), true);

        for(int j = 1; j < str.length(); j++) {
            if(check.containsKey(str.charAt(j))) { // 이전에 나왔던 적이 있는 수라면
                if(str.charAt(j-1) == str.charAt(j)) { // 이전 인덱스와 같은 문자이면
                    // 상관없음
                } else { // 다른 문자라면
                    return true; // 그룹 문자가 아니라고 알려줌
                }
            } else { // 처음 나온 문자라면 추가
                check.put(str.charAt(j), true);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        String[] words = new String[len];
        for(int i = 0; i < len; i++) {
            words[i] = sc.next();
        }
        System.out.println(solution(words));
    }
}
