package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 나이순 정렬
class Member implements Comparable<Member> {
    int memberAge;
    String memberName;

    public Member(int memberAge, String memberName) {
        this.memberAge = memberAge;
        this.memberName = memberName;
    }

    @Override
    public int compareTo(Member o) {
        return this.memberAge - o.memberAge;
    }

    @Override
    public String toString() {
        return memberAge + " " + memberName;
    }
}

public class Sol_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Member> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int memberAge = sc.nextInt();
            String memberName = sc.next();
            list.add(new Member(memberAge, memberName));
        }
        Collections.sort(list);
        for(int i = 0; i < n; i++) System.out.println(list.get(i));
    }
}
