package P1816;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P1816 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.truncateSentence("Hello how are you Contestant", 4));
        
    }
}

class Solution {
    public String truncateSentence(String s, int k) {
        List<String> s_split = Arrays.asList(s.split(" "));
        return IntStream.range(0, k).mapToObj(i -> s_split.get(i)).collect(Collectors.joining(" "));
    }
}