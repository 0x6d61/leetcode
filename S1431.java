import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class S1431 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = { 4, 2, 1, 1, 2 };
        System.out.println(s.kidsWithCandies(input, 1));
    }
}

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).boxed().max(Integer::compareTo).get();
        List<Boolean> result = IntStream.range(1, candies.length).mapToObj(n -> max < candies[n] + extraCandies)
                .collect(Collectors.toList());
        if( max < candies[0]+extraCandies) {
            result.add(0, true);
        }else{
            result.add(0,false);
        }
        return result;
    }
}