package P938;

public class P938 {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode t = new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)),
                new TreeNode(15, new TreeNode(0), new TreeNode(18)));
        System.out.println(s.rangeSumBST(t, 7, 15));
    }
}

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        if (root != null) {
            if (low <= root.val && high >= root.val) {
                result+=root.val;
            }
            
            if (root.left == null && root.right == null) {
                return result;
            }
            result+=rangeSumBST(root.left,low,high);    
            result+=rangeSumBST(root.right,low,high);

            return result;
        }else{
            return result;
        }
    }
}