package P804;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class P804 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.uniqueMorseRepresentations(new String[]{
            "rwjje","aittjje","auyyn","lqtktn","lmjwn"
        }));
    }
}

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        var signalList = new ArrayList<String>();
        String[] signal = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(String word : words) {
            String alphaToSignal = word.chars().mapToObj(w -> String.valueOf((char)w)).map(w -> signal[alphabet.indexOf(w)]).collect(Collectors.joining(""));
            signalList.add(alphaToSignal);
        }

        var result = new HashSet<String>(signalList);
        return result.size();
    }
}