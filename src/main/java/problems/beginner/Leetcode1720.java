package problems.beginner;

import java.util.Arrays;

public class Leetcode1720 {
    public static int[] decode(int[] encoded, int first) {
        int n = encoded.length + 1;
        int[] arr = new int[n];
        arr[0] = first;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }
}

