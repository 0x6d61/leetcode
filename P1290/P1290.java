package P1290;

public class P1290 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.getDecimalValue(new ListNode(1, new ListNode(0,new ListNode(1)))));
    }
}

class Solution {
    public int getDecimalValue(ListNode head) {
        String str = "";
        while(true) {
            if (head.next == null) {
                str+=String.valueOf(head.val);
                break;
            }
            str+=String.valueOf(head.val);
            head = head.next;
        }
        return  Integer.parseInt(str,2);
    }
}