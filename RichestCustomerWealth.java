import java.util.Arrays;
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] input = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(input));
    }
    public static int maximumWealth(int[][] accounts) {
        int result = -1;
        for (int[] num : accounts) {
            result = Math.max(Arrays.stream(num).sum(),result);
        }
        return result;
    }
}
