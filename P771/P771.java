package P771;

public class P771 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numJewelsInStones("aA", "aAAbbbb"));
        
    }
}
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        String[] checkStr = jewels.split("");
        for(String s : checkStr) {
            result+=stones.split(s,-1).length-1;
        }
        return result;
    }
}