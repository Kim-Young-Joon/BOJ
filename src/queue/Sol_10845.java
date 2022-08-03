package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 큐
public class Sol_10845 {
    static Queue<Integer> queue = new LinkedList<>();
    static int last = 0;
    static StringBuilder sb = new StringBuilder();

    static void solution(String command) {
        if(command.charAt(0) == 'p') {
            // pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if(queue.isEmpty()) sb.append("-1\n");
            else sb.append(queue.poll() + "\n");
        } else if(command.charAt(0) == 's') {
            // size: 큐에 들어있는 정수의 개수를 출력한다.
            sb.append(queue.size() + "\n");
        } else if(command.charAt(0) == 'e') {
            // empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
            if(queue.isEmpty()) sb.append("1\n");
            else sb.append("0\n");
        } else if(command.charAt(0) == 'f') {
            // front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if(queue.isEmpty()) sb.append("-1\n");
            else sb.append(queue.peek() + "\n");
        } else if(command.charAt(0) == 'b') {
            // back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            if(queue.isEmpty()) sb.append("-1\n");
            else sb.append(last + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++) {
            String command = sc.next();
            if(command.equals("push")) {
                int num = sc.nextInt();
                last = num;
                queue.offer(num);
            } else {
                solution(command);
            }
        }
        System.out.println(sb);
    }
}