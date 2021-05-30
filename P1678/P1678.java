package P1678;

import java.util.List;
import java.util.ArrayList;

public class P1678 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.interpret("G()()()()(al)"));
    }
}

class Solution {
    public String interpret(String command) {
        char[] list =  command.toCharArray();
        List<String> result = new ArrayList<>();
        for(int i = 0;i<list.length;i++) {
            switch (list[i]) {
                case 'G':
                    result.add("G");
                    break;
                case '(':
                    if(list[i+1] == ')') {
                        result.add("o");
                        i++;
                        break;
                    }else{
                        result.add("al");
                        i+=2;
                        break;
                    }
                default:
                    break;
            } 
        }
        return String.join("",result);
    }
}