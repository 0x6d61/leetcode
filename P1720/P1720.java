package P1720;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

class P1720 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.decode(IntStream.of(6, 2, 7,3).toArray(), 4)));
    }
}

class Solution {
    public int[] decode(int[] encoded, int first) {
        int x = first;
        List<Integer> result = new ArrayList<Integer>();
        for (int e : encoded) {
            result.add(x^e);
            x^=e;
        }
        result.add(0,first);
        return result.stream().mapToInt(i -> i).toArray();
    }
}