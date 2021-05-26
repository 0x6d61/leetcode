package P1470;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class P1470 {
    public static void main(String[] args) {
        Solution s =  new Solution();
        int[] input = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(s.shuffle(input, 3)));
    }    
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> result = new ArrayList<Integer>(nums.length);
        for (int i = 0;i<n;i++) {
            result.add(nums[i]);
            result.add(nums[i+n]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
