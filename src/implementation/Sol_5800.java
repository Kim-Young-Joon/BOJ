package implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 성적통계
public class Sol_5800 {
    static void solution(ArrayList<Integer>[] classes) {
        for(int i = 0; i < classes.length; i++) {
            int max, min, gap = Integer.MIN_VALUE;
            Collections.sort(classes[i]);
            Collections.reverse(classes[i]);
            max = classes[i].get(0);
            min = classes[i].get(classes[i].size()-1);
            for(int j = 0; j < classes[i].size() - 1; j++) {
                if(gap < classes[i].get(j) - classes[i].get(j+1)) {
                    gap = classes[i].get(j) - classes[i].get(j+1);
                }
            }
            System.out.println("Class " + (i+1));
            System.out.println("Max " + max + ", Min " + min + ", Largest gap " + gap);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        ArrayList<Integer>[] classes = new ArrayList[len];
        for(int i = 0; i < len; i++) {
            classes[i] = new ArrayList<>();
            int stuNum = sc.nextInt();
            for(int j = 0; j < stuNum; j++) {
                classes[i].add(sc.nextInt());
            }
        }
        solution(classes);
    }
}
/*
Class 1
Max 78, Min 23, Largest gap 46
Class 2
Max 99, Min 25, Largest gap 25
 */