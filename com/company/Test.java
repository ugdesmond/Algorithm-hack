package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
//        List<String> allList = new ArrayList<>();
//        allList.add("Hell");
//        allList.add("Test");
//        allList.add("checks");
//        boolean check = allList.stream().noneMatch(p -> p.equals("he"));
//        System.out.println("======checks=======" + check);
//        int[] array = {0,0,0,0,0};
//        int val =new Test().isPrimeHappy(32);
//        System.out.println("======ans=======" + val);
//        new Test().processString();
        String test ="testing";
        int i=6;
        int j=7;
        System.out.println(test.substring(i,j));

    }

    int isRapidlyIncreasing(int[] a) {
        if (a.length == 1) return 1;
        int sum;
        for (int x = 0; x < a.length; x++) {
            if (x > 0) {
                sum = calculatePreviousSum(a, x);
                if (a[x] <= sum) return 0;
            }
        }
        return 1;

    }

    int calculatePreviousSum(int[] prevArray, int index) {
        int sum = 0;
        for (int x = index - 1; x >= 0; x--) {
            sum += prevArray[x];
        }
        return 2 * sum;
    }


    int computeWeightedSum(int a[]) {
        int oddSum = 0;
        int evenSum = 0;
        for (int x = 0; x < a.length; x++) {
            if (a[x] % 2 == 0) {
                evenSum += a[x];
            } else {
                oddSum += a[x];
            }
        }
        return (oddSum * 3) + (evenSum * 2);
    }


    int isPrimeHappy(int n) {
        if (n < 3) {
            return 0;
        }
        int limit = n - 1;
        int primeSum = 0;

        while (limit > 1) {
            boolean isPrime = true;
            for (int i = 2; i < limit; i++) {
                if (limit % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                primeSum += limit;
            }
            limit--;
        }
        return primeSum % n == 0 ? 1 : 0;
    }


    private static void sendGET() throws IOException {
        String url = "http://coderbyte.com/api/challenges/json/age-counting";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }

    }
    public void processString() {
        StringBuffer buffer = new StringBuffer();

        String value= "{\"data\":\"key=IAfpK, age=58, key=WNVdi, age=64, key=jp9zt, age=47\"}";
       String [] va= buffer.toString().split(":");
       String data= va[1].replace("}"," ");
       String [] cData=data.split(",");
       int count =0;
       for(String d:cData){
           if(d.contains("age")){
               String [] v=d.split("=");
               if(Integer.parseInt(v[1].replaceAll("\\D+",""))>=50) {
                   count++;
               }
           }
       }


       




    }


}