package P1688;

public class P1688 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numberOfMatches(7));
    }
}

class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                result += n-(n / 2);
                n = n / 2;
            } else {
                result += n-((n - 1) / 2 + 1);
                n = (n - 1) / 2 + 1;
            }
        }
        return result;
    }
}