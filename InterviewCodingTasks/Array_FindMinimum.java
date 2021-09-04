import java.util.Arrays;

public class Array_FindMinimum {

    /*
    Write a function that can find the maximum number from an int Array
     */

    //Solution 1:
    public int maxValue(int[] n) {

        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    //Solution 2:
    public static int maxValue2( int[]  n ) {
        Arrays.sort( n );
        return  n [ 0 ];
    }


}