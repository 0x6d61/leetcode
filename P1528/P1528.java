package P1528;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.HashMap;
import java.util.List;

public class P1528 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] input = {4,5,6,7,0,2,1,3};
        System.out.println(s.restoreString("codeleet",input));
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {
        Map<String,String> dict = new HashMap<String,String>();

        for (int i = 0;i<indices.length;i++) {
            dict.put(String.valueOf(indices[i]),String.valueOf(s.charAt(i)));
        }

        List<String> result = IntStream.range(0,indices.length)
                .mapToObj(n -> dict.get(String.valueOf(n)))
                .collect(Collectors.toList());
        return String.join("",result);

    }
}
