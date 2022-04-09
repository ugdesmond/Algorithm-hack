package com.company.thread;

import java.util.Scanner;

public class SCANNER {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // creates instance of Scanner to read from console
            int num = 0;
            if (sc.hasNextInt())
                num = sc.nextInt();
            else {
                System.out.printf("Input error, program terminating");
                sc.close(); // close scanner
                return;
            }
            String str = sc.nextLine();

            sc.close(); // close scanner
        }

}
