package Test;

import java.util.Scanner;
//JAVA
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string of values eg 11235888 :");
        int intVal = in.nextInt();
        boolean check = validate(intVal);
        if (!check) throw new RuntimeException("OUt of range");
        int val = compute(intVal, 0, 0, 0);
        System.out.println(val);
    }

    public static int compute(Integer peterNum, int indice, int lst, int newTry) {
        int valLength = peterNum.toString().length();
        if (indice == valLength) {
            if (newTry <= peterNum) return newTry;
            return 0;
        } else {
            int chif = 9;
            while (chif >= lst) {
                int newT = newTry * 10 + chif;
                int res = compute(peterNum, indice + 1, chif, newT);
                if (res > 0) return res;
                chif--;
            }
        }
        return 0;
    }

    private static boolean validate(int num) {
        return num >= 1 && num <= Math.pow(10, 8);
    }
}