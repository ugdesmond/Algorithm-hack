package Test;

import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
//JAVA
public class Test1 {


    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("(", 0);
        map.put(")", 0);
        map.put("+", 1);
        map.put("-", 1);
        map.put("*", 2);
        map.put("/", 2);
        Stack<String> stack = new Stack<>();
        Stack<Double> stackVal = new Stack<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string of values eg 2+5*6-7*(9+1) :");
        String st = in.nextLine();
        int length = st.length();
        int x = 0;
        int i = 0;
        int j = 1;
        while (x < length) {
            String s = st.substring(i, j);
            x++;
            i++;
            j++;
            if (!map.containsKey(s)) {
                stackVal.push(Double.parseDouble(s));
                continue;
            }
            while (true) {
                if (stack.isEmpty() || s.equals("(") || (map.get(s) > map.get(stack.peek()))) {
                    stack.push(s);
                    break;
                }
                String op = stack.pop();
                if (op.equals("(")) {
                    assert s.equals(")");
                    break;
                } else {
                    double val2 = stackVal.pop();
                    double val1 = stackVal.pop();
                    stackVal.push(process(op, val1, val2));
                }
            }

        }
        while (!stack.isEmpty()) {
            String op = stack.pop();
            double val2 = stackVal.pop();
            double val1 = stackVal.pop();
            stackVal.push(process(op, val1, val2));
        }
        System.out.println("Total="+stackVal.pop());
        assert stackVal.isEmpty();
        assert stack.isEmpty();
    }

    public static double process(String op, double val1, double val2) {
        if (op.equals("+")) return val1 + val2;
        if (op.equals("-")) return val1 - val2;
        if (op.equals("/")) return val1 / val2;
        if (op.equals("*")) return val1 * val2;
        throw new RuntimeException("Not valid");
    }
}