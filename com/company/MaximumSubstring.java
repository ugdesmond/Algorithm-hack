package com.company;

public class MaximumSubstring {


        static String LexicographicalMaxString(String str)
        {
            String mx = "";
            for (int i = 0; i < str.length(); ++i) {
                if (mx.compareTo(str.substring(i)) <= 0) {
                    mx = str.substring(i);
                }
            }

            return mx;
        }

        // Driver code
        public static void main(String[] args)
        {
            String str = "baca";

            System.out.println(LexicographicalMaxString(str));
        }

}
