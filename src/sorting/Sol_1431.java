package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

// 시리얼 번호
class Serial implements Comparable<Serial> {
    String serial;

    public Serial(String serial) {
        this.serial = serial;
    }

    @Override
    public int compareTo(Serial o) {
        if (serial.length() < o.serial.length()) {
            return 1;
        } else if (serial.length() > o.serial.length()) {
            return -1;
        } else {
            int sum1 = 0;
            int sum2 = 0;

            for (int i = 0; i < serial.length(); i++) {
                if ((byte) serial.charAt(i) >= (byte) '0' && (byte) serial.charAt(i) <= (byte) '9') {
                    sum1 += serial.charAt(i)-'0';
                }
                if ((byte) o.serial.charAt(i) >= (byte) '0' && (byte) o.serial.charAt(i) <= (byte) '9') {
                    sum2 += o.serial.charAt(i)-'0';
                }
            }

            if (sum1 < sum2) {
                return 1;
            } else if (sum1 > sum2) {
                return -1;
            } else {
                for (int i = 0; i < serial.length(); i++) {
                    if (serial.charAt(i) < o.serial.charAt(i)) {
                        return 1;
                    } else if (serial.charAt(i) > o.serial.charAt(i)) {
                        return -1;
                    }
                }
            }

        }
        return 0;
    }

    @Override
    public String toString() {
        return serial;
    }
}

public class Sol_1431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Serial> list = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String serial = sc.next();
            list.add(new Serial(serial));
        }

        list.sort(Comparator.reverseOrder());

        for (Serial serial : list) {
            System.out.println(serial);
        }
    }
}
