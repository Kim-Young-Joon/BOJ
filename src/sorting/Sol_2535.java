package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 아시아 정보올림피아드
class Result {
    int country_num;
    int student_num;
    int score;

    public Result(int country_num, int student_num, int score) {
        this.country_num = country_num;
        this.student_num = student_num;
        this.score = score;
    }
}

public class Sol_2535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Result[] results = new Result[n];
        int[] countryNumArray = new int[101];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int country_num = Integer.parseInt(st.nextToken());
            int student_num = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            results[i] = new Result(country_num, student_num, score);
        }

        Arrays.sort(results, new Comparator<Result>() {
            @Override
            public int compare(Result o1, Result o2) {
                return o2.score - o1.score;
            }
        });
        int count = 0;
        int print = 0;
        while (print <3) {
            int country_num = results[count].country_num;
            countryNumArray[country_num]++;

            if (countryNumArray[country_num] <3) {
                System.out.println(results[count].country_num+" "+results[count].student_num);
                print++;
            }
            count++;
        }
    }
}