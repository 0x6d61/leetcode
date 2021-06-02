package P1656;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class P1656 {
    public static void main(String[] args) {
        OrderedStream o = new OrderedStream(9);
        List<List<String>> orders = new ArrayList<List<String>>(
                Arrays.asList(Arrays.asList("9", "nghbm"), Arrays.asList("7", "hgeob"), Arrays.asList("6", "mwlrz"),
                        Arrays.asList("4", "oalee"), Arrays.asList("2", "bouhq"), Arrays.asList("1", "mnknb"),
                        Arrays.asList("5", "qkxbj"), Arrays.asList("8", "iydkk"), Arrays.asList("3", "oqdnf")));
        for (List<String> order : orders) {
            System.out.println(
                    Arrays.toString(o.insert(Integer.parseInt(order.get(0)), order.get(1)).stream().toArray()));
        }
    }
}

class OrderedStream {

        private int pointer;
        private final String[] array;

        public OrderedStream(int n) {
            array = new String[n];
        }

        public List<String> insert(int idKey, String value) {
            array[idKey - 1] = value;
            if(array[pointer] == null) return new ArrayList<>();

            List<String> list = new ArrayList<>();
            for(int i = pointer; i < array.length; i++) {
                if(array[i] == null) {
                    pointer = i;
                    break;
                }
                list.add(array[i]);
            }
            return list;
        }
    }