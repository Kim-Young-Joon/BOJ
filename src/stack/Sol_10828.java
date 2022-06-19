package stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 스택
public class Sol_10828 {
    static ArrayList<Integer> stack = new ArrayList<>();

    static void solution() throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(scan.readLine());

        for(int i = 1; i <= N; i++) {
            String command = scan.readLine();
            int len = command.length();

            if(len > 5) { // push
                int num = Integer.parseInt(command.substring(5));
                stack.add(num);
            } else if(len == 5) { // empty
                if(stack.size() == 0)
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if(len == 4) { // size
                System.out.println(stack.size());
            } else if(len == 3) { // pop, top
                if(stack.size() == 0) {
                    System.out.println(-1);
                } else {
                    if(command.equals("pop"))
                        pop();
                    if(command.equals("top"))
                        top();
                }
            }
        }
    }

    static void pop() {
        int index = stack.size() - 1;
        System.out.println(stack.remove(index));
    }

    static void top() {
        int index = stack.size() - 1;
        System.out.println(stack.get(index));
    }

    public static void main(String[] args) throws Exception{
        solution();
    }
}
