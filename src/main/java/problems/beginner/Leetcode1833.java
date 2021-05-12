package problems.beginner;

import java.util.Arrays;

public class Leetcode1833 {
    public static int maxIceCream(int[] costs, int coins) {
        int count = 0;
        Arrays.sort(costs);
        System.out.println(Arrays.toString(costs));
        for (int item:costs){
            if(coins >= item){
                count = count + 1;
                coins = coins - item;
            }
            else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }

}
