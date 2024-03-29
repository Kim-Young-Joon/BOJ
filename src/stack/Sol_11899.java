package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 괄호 끼워넣기
public class Sol_11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        Stack<Character> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                stack.add(c);
            }else {
                if(stack.empty()) {
                    ans++;
                }else {
                    stack.pop();
                }
            }
        }
        ans += stack.size();
        System.out.println(ans);
    }
}
