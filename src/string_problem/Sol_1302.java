package string_problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

// 베스트 셀러
public class Sol_1302 {
    static HashMap<String, Integer> myData = new HashMap<>();


    static void input() {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for(int i = 0 ; i < size; i++) {
            String str = sc.next();
            if(myData.containsKey(str)) {
                myData.put(str, myData.get(str) + 1);
            } else {
                myData.put(str, 1);
            }
        }
    }

    static void solution() {
        String[] books = new String[myData.size()]; // 책 이름 저장
        int[] cnt = new int[myData.size()];

        int index = 0;
        for( String str : myData.keySet()) {
            books[index] = str;
            index++;
        } // key로 들어가 있는 책이름 저장

        // 정렬
        Arrays.sort(books);

        // 베스트 셀러 찾기
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for(int i = 0; i < books.length; i++) {
            cnt[i] = myData.get(books[i]);
            if(max < cnt[i]) {
                max = cnt[i];
                maxIndex = i;
            }
        }
        System.out.println(books[maxIndex]);
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
