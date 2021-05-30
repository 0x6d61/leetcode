package P1832;

import java.util.Arrays;

public class P1832 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
}

class Solution {
    public boolean checkIfPangram(String sentence) {
        Boolean[] check = new Boolean[26];
        for(char c : sentence.toCharArray()) {
            int index = (int)c - (int)'a';
            check[index] = true;
        }
        if(Arrays.asList(check).stream().filter(i -> i != null).toArray().length == 26) {
            return true;
        }else{
            return false;
        }
    }
}