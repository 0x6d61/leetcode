package P1512;

public class P1512 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {1,2,3,1,1,3};
        System.out.println(s.numIdenticalPairs(input));
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        for(int i = 0;i<nums.length;i++) {
            for(int j = i+1;j<nums.length;j++) {
                if(nums[i] == nums[j]) {
                    result+=1;
                }
            }
        }
        return result;
    }
}