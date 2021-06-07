package P832;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Arrays;

public class P832 {
    public static void main(String[] args) {
        Solution s = new Solution();
        for (int[] arr : s.flipAndInvertImage(
                new int[][] { new int[] { 1, 1, 0 }, new int[] { 1, 0, 1 }, new int[] { 0, 0, 0 } })) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            List<Integer> list = Arrays.stream(image[i]).boxed().collect(Collectors.toList());
            Collections.reverse(list);
            image[i] = list.stream().mapToInt(j -> j).toArray();
        }
        for (int i = 0; i < image.length; i++) {
            image[i] = bitInversion(image[i]);
        }

        return image;

    }

    public int[] bitInversion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;
    }
}