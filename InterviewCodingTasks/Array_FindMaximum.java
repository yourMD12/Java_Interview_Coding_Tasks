import java.util.Arrays;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */

    //Solution 1:
    public int maxValue(int[] n) {

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


}
