package P1534;

public class P1534 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.countGoodTriplets(new int[] { 3, 0, 1, 1, 9, 7 }, 7, 2, 3));

    }
}

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr.length;j++) {
                for(int k = 0;k<arr.length;k++) {
                    if(i < j && j < k) {
                        if(Math.abs(arr[i]-arr[j]) <= a && Math.abs(arr[j]-arr[k]) <= b && Math.abs(arr[i]-arr[k]) <= c) {
                            result+=1;
                            
                        }
                    }
                }
            } 
        }
        return result;
    }
}