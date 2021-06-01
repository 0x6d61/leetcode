package P1662;

public class P1662 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.arrayStringsAreEqual(new String[]{"ab","c"}, new String[]{"a","bc"}));
    }
}

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(String.join("",word1).equals(String.join("",word2))) {
            return true;
        }else{
            return false;
        }
    }
}
