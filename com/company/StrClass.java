package com.company;

public class StrClass {
    public static void main(String[] args) {
        String hayStack = "mississippi";
        String needle = "issip";
        int val = strStr(hayStack, needle);
        System.out.println("======val======" + val);

    }

    private static int processStr(String hayVal, String needleVal) {
        int index = 0;
        if (needleVal.isEmpty())
            return 0;
        int y = 0;
        for (int x = 0; x < hayVal.length(); x++) {

            if (hayVal.charAt(x) == needleVal.charAt(y)) {
                if (y == 0) {
                    index = x;
                }
                y++;

                if (y == needleVal.length()) {
                    break;
                }
            } else {
                y = 0;
            }
        }
        if (y == needleVal.length()) {
            return index;
        }
        return -1;
    }
    private static int  strStr(String hay,String needle){
        if(hay.length()==0) return 0;
        if(needle.length()> hay.length()) return -1;
        int hayLength = hay.length();
        int needleLength = needle.length();
        for(int x =0 ;x<=hayLength-needleLength;x++){
            int j;
            for( j =0;j < needleLength;j++){
                if(hay.charAt(j+x) != needle.charAt(j))
                    break;
            }
            if (j==needleLength){
                return x;
            }
        }
        return -1;
    }
}
