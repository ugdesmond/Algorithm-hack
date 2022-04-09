package com.company;
import java.util.*;

public class ContainsDuplicate111 {
    public static void main(String [] args){

       int  []array = {1,2,3,1};
   Boolean result =     new ContainsDuplicate111().containsNearbyAlmostDuplicate(array,3,0);
   System.out.println("======result======"+result);
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < nums.length; ++i) {
            // Find the successor of current element
            Integer s = set.ceiling(nums[i]);
            if (s != null && s <= nums[i] + t) return true;

            // Find the predecessor of current element
            Integer g = set.floor(nums[i]);

            if (g != null && nums[i] <= g + t) return true;

            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
    //time complexity: O(nlog(min(n,k))
    //space complexity:O(min(n,k));
}
