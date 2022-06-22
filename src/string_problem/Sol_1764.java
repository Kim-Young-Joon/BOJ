package string_problem;

import java.util.*;

// 듣보잡
public class Sol_1764 {
    static HashSet<String> mySet;

    static void input() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        mySet = new HashSet<>();

        for(int i = 0; i < N; i++) {
            mySet.add(sc.next());
        }

        int cnt = 0;
        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i < M; i++) {
            String str = sc.next();

            if(mySet.contains(str)) {
                cnt++;
                ans.add(str);
            }
        }
        output(cnt, ans);
    }

    static void output(int cnt, ArrayList<String> ans) {
        Collections.sort(ans);
        System.out.println(cnt);
        for(String str : ans)
            System.out.println(str);
    }

    public static void main(String[] args) {
        input();
    }
}
