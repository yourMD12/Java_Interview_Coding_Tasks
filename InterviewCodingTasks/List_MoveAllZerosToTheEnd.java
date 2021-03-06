import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of the List of integers
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

   // public static List<Integer> moveZerosToTheEnd() {
   public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(0);
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize - newSize;
        for (int i = 0; i < totalNumberOfZeros; i++) {
            list.add(0);
        }
       System.out.println(list);
   }

    public static int[] moveZeros( int[]  arr ) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for(int each: arr) {
            list.add(each);
            countZero += (each==0) ? 1 : 0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i = 0; i < arr.length - countZero; i++ ) {
            arr[i] = list.get(i);
        }
        return arr;
    }




}
