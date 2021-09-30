import java.util.Arrays;

public class Array_MergeTwoArrays {

    /*
    Write a return method that can concat two arrays
     */

    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }
        for (int each : arr2) {
            result[i++] = each;
        }
        return result;
    }

    public static void main(String[] args) {
//        String str = Arrays.toString(concatTwoArrays(new int[]{1, 2, 3, 4, 5}, new int[]{9, 8, 7, 6, 5, 4}));
//        System.out.println(str);

        System.out.println(Arrays.toString(concatTwoArrays(new int[]{1, 2, 3, 4, 5}, new int[]{9, 8, 7, 6, 5, 4})));

    }

}
