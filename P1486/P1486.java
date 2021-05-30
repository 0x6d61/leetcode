package P1486;

import java.util.stream.IntStream;

public class P1486 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.xorOperation(4,3));
    }
}

class Solution {
    public int xorOperation(int n, int start) {
        return IntStream.iterate(start,i->i + 2).limit(n).reduce((acc,val) -> acc^=val).getAsInt();
    }
}