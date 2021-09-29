import java.util.Arrays;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */

    //Solution 1:
    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    //Solution 2:
    public static int maxValue2(int[] n) {
        Arrays.sort(n);
        return n[n.length-1];
    }

    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{2, 4, 7, 4, 9, 0}));
        System.out.println(maxValue2(new int[]{2, 4, 6, 8, 9, 7}));
    }


}
