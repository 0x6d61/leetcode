package P1732;


import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class P1732 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.largestAltitude(new int[] {-5,1,5,0,-7}));
    }
}


class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer> list = new ArrayList<>();
        list.add(0,0);
        for(int i = 0;i<gain.length;i++) {
            list.add(i+1,list.get(i) + gain[i]);
        }
        System.out.println(list);
        return list.stream().max(Comparator.naturalOrder()).get();
    }
}