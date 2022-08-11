package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 좌표 정렬하기
class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}

public class Sol_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            list.add(new Point(x, y));
        }
        Collections.sort(list);
        for(int i = 0; i < n; i++) {
            System.out.println(list.get(i));
        }
    }
}
