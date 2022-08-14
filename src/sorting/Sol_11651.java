package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 좌표 정렬하기 2
class MyPoint implements Comparable<MyPoint> {
    int x, y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(MyPoint o) {
        if(this.y == o.y) return this.x - o.x;
        else return this.y - o.y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Sol_11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MyPoint> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new MyPoint(x, y));
        }
        Collections.sort(list);
        for (MyPoint myPoint : list) System.out.println(myPoint);
    }
}
