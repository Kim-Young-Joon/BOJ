package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// 후위 표기식 2
public class Sol_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        double[] operand = new double[n];
        char[] inputVal = br.readLine().toCharArray();

        Stack<Double> stack = new Stack<>();
        for(int i = 0; i < n; i++) {
            operand[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < inputVal.length; i++) {
            if (Character.isAlphabetic(inputVal[i])) {
                int index = (int) inputVal[i] - 65;
                stack.push(operand[index]);
            } else {
                Double result = 0.d;
                Double pop1 = stack.pop();
                Double pop2 = stack.pop();

                if (inputVal[i] == '+') {
                    result = pop2 + pop1;
                }

                if (inputVal[i] == '-') {
                    result = pop2 - pop1;
                }

                if (inputVal[i] == '*') {
                    result = pop2 * pop1;
                }

                if (inputVal[i] == '/') {
                    result = pop2 / pop1;
                }

                stack.push(result);
            }
        }
        System.out.format("%.2f", stack.pop());
    }
}
