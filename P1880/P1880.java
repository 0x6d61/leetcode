package P1880;


import java.util.stream.Collectors;

public class P1880 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isSumEqual("acb", "cba", "cdb"));
    }
}

class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String first = this.letterIndexToNumber(firstWord);
        String second = this.letterIndexToNumber(secondWord);
        String target = this.letterIndexToNumber(targetWord);
        int sum = Integer.parseInt(first,10) + Integer.parseInt(second,10);
        return sum == Integer.parseInt(target, 10);
    }

    public String letterIndexToNumber(String str) {
        String letters = "abcdefghij";
        return str.chars().mapToObj(i -> (char)i)
        .map(i -> letters.indexOf(String.valueOf(i))).mapToInt(i -> i)
        .mapToObj(i -> String.valueOf(i))
        .collect(Collectors.joining(""));
    }
}