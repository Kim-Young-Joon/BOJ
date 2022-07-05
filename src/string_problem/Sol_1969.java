package string_problem;

import java.util.Scanner;

// DNA
public class Sol_1969 {
    static char[] DNA = {'A', 'C', 'G', 'T'};
    static String[] arrDNA;
    static int len;

    static void input() {
        Scanner sc = new Scanner(System.in);
        int arrlen = sc.nextInt();
        len = sc.nextInt();

        arrDNA = new String[arrlen];

        for(int i = 0; i < arrlen; i++) {
            arrDNA[i] = sc.next();
        }
    }

    static void solution() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++) {
            int[] dna = new int[4]; // A, C, G, T
            for(int j = 0; j < arrDNA.length; j++) {
                char c = arrDNA[j].charAt(i);
                if(c == DNA[0]) {
                    dna[0]++;
                } else if(c == DNA[1]) {
                    dna[1]++;
                } else if(c == DNA[2]) {
                    dna[2]++;
                } else if(c == DNA[3]) {
                    dna[3]++;
                }
            }
            sb.append(DNA[myDNA(dna)]);
        }
        System.out.println(sb);
        System.out.println(output(sb.toString()));
    }

    static int myDNA(int[] dna) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < dna.length; i++) {
            if(dna[i] > max) {
                max = dna[i];
                index = i;
            }
        }
        return index;
    }

    static int output(String target) {
        int answer = 0;
        for(int i = 0; i < arrDNA.length; i++) {
            for(int j = 0; j < arrDNA[i].length(); j++) {
                if(target.charAt(j) != arrDNA[i].charAt(j))
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        input();
        solution();
    }
}
