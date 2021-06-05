package P1684;

public class P1684 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countConsistentStrings("ab", new String[] { "ad","bd", "aaab", "baa", "badab" }));
    }
}

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for (String w : words) {
            if (w.chars().mapToObj(i -> String.valueOf((char) i)).allMatch(s -> allowed.indexOf(s) != -1)) {
                result += 1;
            }
        }
        return result;
    }
}