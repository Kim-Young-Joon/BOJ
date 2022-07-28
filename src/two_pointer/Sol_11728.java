package two_pointer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// 배열 합치기
public class Sol_11728 {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input=br.readLine().split(" ");
        int n=Integer.parseInt(input[0]), m=Integer.parseInt(input[1]);
        int size=n+m;
        int[] result=new int[size];

        String[] arrayA=br.readLine().split(" ");
        String[] arrayB=br.readLine().split(" ");

        int idx=0;
        for(int i=0;i<n;i++) {
            result[idx++]=Integer.parseInt(arrayA[i]);
        }
        for(int i=0;i<m;i++) {
            result[idx++]=Integer.parseInt(arrayB[i]);
        }
        Arrays.sort(result);

        for(int r:result) {
            bw.write(String.valueOf(r)+" ");
        }

        bw.flush();
        bw.close();
    }
}
