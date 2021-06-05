package P1884;

import java.util.stream.Collectors;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class P1884 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.replaceDigits("v0g6s4d"));
        
    }
}

class Solution {
    public String replaceDigits(String strs) {
        var result = new ArrayList<String>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Pattern num = Pattern.compile("[0-9]");
        List<String> list = strs.chars().mapToObj(i->String.valueOf((char)i)).collect(Collectors.toList());
        for(int i = 0;i<list.size();i++) {
            Matcher n = num.matcher(list.get(i));
            if(n.matches()) {
                Integer next = alphabet.indexOf(list.get(i-1))+Integer.parseInt(n.group());
                 result.add(i,String.valueOf(alphabet.charAt(next)));
            }else{
                result.add(i,list.get(i));
            }
        }
        return result.stream().collect(Collectors.joining(""));
    }
}