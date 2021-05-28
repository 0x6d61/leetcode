package P1365;

import java.util.Arrays;


public class P1365 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {8,1,2,2,3};
        System.out.println(Arrays.toString(s.smallerNumbersThanCurrent(input)));
    }
}


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            int count = 0;
            for(int j = 0;j<nums.length;j++) {
                if (i == j) continue;
                if (nums[i] > nums[j]) {
                    count+=1;
                }
            }
            result[i] = count;
        }
        return result;       
    }
}