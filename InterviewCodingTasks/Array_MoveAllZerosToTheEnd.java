import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
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
    }
    }

