package com.company;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SubArrayGeneration {


    public static void main (String [] args){
      int [] list = new int[]{1,11};
        ArrayList<Integer> path = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        recurse(result, path, list, 0);
      System.out.println("======Result====="+new Gson().toJson(result));

    }


    public  static void recurse(List<List<Integer>> result, ArrayList<Integer> path, int[] nums, int i){
        //still a very big problem for me..quite complex;

        if(i == nums.length){
            // add the created combination
            result.add(new ArrayList(path));
            return;
        }
        // don't add current value to this subset
        recurse(result, path, nums, i+1);
        // add current value to this subset
//        path.add(nums[i]);
        recurse(result, path, nums, i+1);
        path.remove(path.size()-1);

    }
}
