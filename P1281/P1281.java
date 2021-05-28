package P1281;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;

public class P1281 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.subtractProductAndSum(4421));
    }
}

class Solution {
    public int subtractProductAndSum(int n) {
        List<Integer> nums = String.valueOf(n)
                                   .chars()
                                    .mapToObj(e -> Character.getNumericValue((char)e))
                                    .collect(Collectors.toList());
        
        Integer left = nums.stream().reduce(0, (sum,elm) -> sum+elm);
        Integer right = IntStream.range(1, nums.size())
        .reduce(nums.get(0),(mul,elm)->mul*nums.get(elm));
        return right - left;
        
    }
}