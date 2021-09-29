import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int[] moveZerosToTheEnd(int[] array) { // {1,2,0,3,4,0,0,5,6} 9=total 0= 3 rest =6

        int[] result = new int[array.length]; // [1 2 3 4 5 6 0 0 0 ]
        int count = 0;
        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,0,3,4,0,0,5,6};
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        System.out.println("moveZerosToTheEnd(new int[]{1,2,0,3,4,0,0,5,6}) = " + Arrays.toString(moveZerosToTheEnd(new int[]{1, 2, 0, 3, 4, 0, 0, 5, 6})));
    }

    }

