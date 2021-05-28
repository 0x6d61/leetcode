package P1342;

public class P1342 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numberOfSteps(14));
    }
}


class Solution {
    public int numberOfSteps(int num) {
        int result = num;
        int count = 0;
        while(0<result) {
            if (result%2==0) {
                result/=2;
                count++;
            }else{
                result-=1;
                count++;
            }
        }
        return count;
    }
}