package P1221;

public class P1221 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.balancedStringSplit("RLRRLLRLRL"));
    }
}

class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int result = 0;
        for (char c : s.toCharArray()) {
            if (r == l) {
                r = 0;
                l = 0;
                result+=1;
            }

            if (c == 'L') {
                l++;
            }else{
                r++;
            }
        }
        return result;
    }
}