package P1021;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;


public class P1021 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeOuterParentheses("()()"));
    }
}

class Solution {
    public String removeOuterParentheses(String s) {
        List<String> result = new ArrayList<>();
        List<String> list = s.chars().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.toList());
        int count = 0;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > index) {
                if (list.get(i).equals("(") && i != 0) {
                    count++;
                    if (count > 0) {
                        result.add(list.get(i));
                    }
                }else if(list.get(i).equals(")")){
                    index=i;
                    if(count > 0) {
                        result.add(list.get(i));
                    }
                    count--;
                }
            }
        }
        return result.stream().collect(Collectors.joining(""));
    }
}
