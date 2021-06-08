package P1725;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Comparator;

public class P1725 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countGoodRectangles(new int[][]{new int[]{5,8},new int[]{3,9},new int[]{5,12},new int[]{16,5}}));
    }
}

    class Solution {
        public int countGoodRectangles(int[][] rectangles) {
            List<Integer> list = IntStream.range(0, rectangles.length)
                    .mapToObj(i -> Integer.valueOf(Math.min(rectangles[i][0], rectangles[i][1])))
                    .collect(Collectors.toList());
            Integer max = list.stream().max(Comparator.naturalOrder()).get();
            var result = list.stream().filter(i -> i.equals(max)).collect(Collectors.toList());
            return result.size();
        }
    }
