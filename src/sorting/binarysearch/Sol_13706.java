package sorting.binarysearch;

import java.math.BigInteger;
import java.util.Scanner;

// 제곱근
public class Sol_13706 {
    static void solution(String num) {
        BigInteger one = BigInteger.ONE;
        BigInteger two = new BigInteger("2");
        BigInteger target = new BigInteger(num);

        BigInteger left = BigInteger.ONE;
        BigInteger right = new BigInteger(num);

        BigInteger mid, x;
        while(left.compareTo(right) <=0) {
            mid = (left.add(right)).divide(two);
            x = mid.multiply(mid);
            int ret = x.compareTo(target);

            if (ret == 0) {
                System.out.println(mid);
                break;
            } else if (ret == -1) {
                left = mid.add(one);
            } else if (ret == 1) {
                right = mid.subtract(one);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        solution(num);
    }
}
