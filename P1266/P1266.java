package P1266;

import java.util.Arrays;

public class P1266 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.minTimeToVisitAllPoints(new int[][]{new int[]{3,-2},new int[]{-2,2}}));
    }
}

class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 1;i<points.length;i++) {
            int[] point = points[i];
            int[] before_point = points[i-1];
            result+=Math.max(Math.abs(point[0]-before_point[0]),Math.abs(point[1]-before_point[1]));
        }
        return result;
    }
}

