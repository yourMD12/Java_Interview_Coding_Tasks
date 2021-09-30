import java.util.Arrays;

public class Array_Reverse {

    /*
    write a function that can reverse an array
     */

    public static int[] reverse(int[] arr){  // [2,5,7,9,0,3,1]

        int[] result = new int[arr.length]; // [0 0 0 0 0 0 0]
        for(int i = arr.length-1, j=0; i >= 0 ; i--, j++){
            result[j] = arr[i];
        }
        return result;
    }

    public static void main (String [] args){
        System.out.println(Arrays.toString(reverse(new int[]{2, 5, 7, 9, 0, 3, 1})));
    }

}
