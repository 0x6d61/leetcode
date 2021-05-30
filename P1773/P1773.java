package P1773;

import java.util.List;
import java.util.Arrays;

public class P1773 {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<List<String>> items = Arrays.asList(Arrays.asList("phone","blue","pixel"),Arrays.asList("computer","silver","lenovo"),Arrays.asList("phone","gold","iphone"));
        System.out.println(s.countMatches(items,"color","silver"));
    }
}

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result = 0;
        int type = 0;
        switch (ruleKey) {
            case "type": {
                break;
            }
            case "color": {
                type = 1;
                break;
            }
            case "name": {
                type = 2;
                break;
            }
        }
        for (List<String> i : items) {
            if (i.get(type).equals(ruleValue)) {
                result+=1;
            }
        }
        return result;
    }
}