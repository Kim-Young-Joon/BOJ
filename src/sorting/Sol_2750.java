package sorting;

import java.io.*;
import java.util.*;

// 수 정렬하기
public class Sol_2750 {
    static int N;
    static ArrayList<Integer> list;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        list = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
    }

    static void output() {
        StringBuilder sb = new StringBuilder();
        for(int val : list) {
            sb.append(val).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException{
        input();
        output();
    }
}
