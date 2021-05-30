package P1389;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class P1389 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1})));
    }
}

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int c = 0;
        for(int i : index) {
            list.add(i,nums[c]);
            c++;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}