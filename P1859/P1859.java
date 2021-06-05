package P1859;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.regex.Matcher;

public class P1859 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.sortSentence("is2 sentence4 This1 a3"));
    }
}

class Solution {
    public String sortSentence(String s) {
        Map<Integer, String> word_list = new HashMap<>();
        String[] words = s.split(" ");
        for (String w : words) {
            Pattern letter = Pattern.compile("^[A-za-z]+");
            Pattern num = Pattern.compile("[0-9]$");
            Matcher n = num.matcher(w);
            Matcher l = letter.matcher(w);
            if (n.find() && l.find()) {
                word_list.put(Integer.valueOf(n.group()) - 1, l.group());
            }

        }
        System.out.println(word_list.get((Integer) 1));
        return IntStream.range(0, word_list.size()).mapToObj(i -> word_list.get(Integer.valueOf(i)))
                .collect(Collectors.joining(" "));
    }
}