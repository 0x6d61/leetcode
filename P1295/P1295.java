package P1295;

public class P1295 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.findNumbers(new int[]{12,345,2,6,7896}));
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int n : nums) {
            if (String.valueOf(n).length()%2 == 0) {
                result++;
            } 
        }
        return result;
    }
}
