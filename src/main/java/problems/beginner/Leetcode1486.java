package problems.beginner;

public class Leetcode1486 {
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int res = start;
        for (int i = 0; i < n; i++){
            nums[i] = start + 2 * i;
            if (i > 0){
                res = res ^ nums[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(5, 0));
    }
}
