package P1588;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class P1588 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.sumOddLengthSubarrays(new int[] { 10,11,12 }));
    }
}

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int i = 3; i <= list.size(); i++) {
            if (i % 2 != 0) {
                int end = i;
                for (int j = 0; j < list.size(); j++) {
                    if (end > list.size()) {
                        break;
                    }
                    result += list.subList(j, end).stream().reduce(0, (acc, val) -> acc += val);
                    end += 1;
                }
            }
        }
        result+=list.stream().reduce(0, (acc,val) -> acc += val);
        return result;
    }
}