package implementation;

import java.util.Scanner;

// 오늘도 졌다
public class Sol_14582 {
    static String solution(int[] myTeam, int[] other) {
        int sum = 0;
        for(int i = 0; i < 9; i++) {
            sum += myTeam[i];
            if(sum > 0) return "Yes";
            sum -= other[i];
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myTeam = new int[9];
        int[] other = new int[9];
        for(int i = 0; i < 9; i++) myTeam[i] = sc.nextInt();
        for(int i = 0; i < 9; i++) other[i] = sc.nextInt();
        System.out.println(solution(myTeam, other));
    }
}
