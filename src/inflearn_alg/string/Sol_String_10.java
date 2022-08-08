package inflearn_alg.string;

import java.util.Scanner;

// 문자거리
// 문자별 e 와의 거리를 구한다. index 0에서 끝으로, 끝에서 0으로 두번 확인
public class Sol_String_10 {
    static int[] solution(String str, char target) {
        int[] answer = new int[str.length()];
        int dist = 1000; // 입력하는 문자 간의 거리보다 훨씬 큰 수로 지정

        for(int i = 0; i < str.length(); i++) { // index 0 부터 확인
            if(str.charAt(i) == target) {
                dist = 0;
                answer[i] = dist;
            } else {
                dist++;
                answer[i] = dist;
            }
        }

        dist = 1000;
        for(int i = str.length()-1; i >= 0; i--) { // index 끝에서부터 확인
            if(str.charAt(i) == target) {
                dist = 0;
            } else {
                dist++;
                answer[i] = Math.min(answer[i], dist); // 기존 값과 새로 갱신한 값 중 작은 값으로 갱신
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);
        for(int x : solution(str, target))
            System.out.print(x + " ");
    }
}
