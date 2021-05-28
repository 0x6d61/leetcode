package P1313;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class P1313 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.decompressRLElist(1,2,3,4)));
    }
}

class Solution {
    public int[] decompressRLElist(int... nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 1;i<nums.length;i+=2) {
            for (int j = 0;j<nums[i-1];j++) {
                result.add(nums[i]);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}