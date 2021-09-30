import java.util.ArrayList;
import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
         int[] arr = {10, 9, 8, 7};
         arr = Sort(arr);   ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortingArrayAsc(new int[] {8,6,2,0,6,4,7})));
    }

    //Solution 1:
    public static int[] sortingArrayAsc(int[] arr) {
        int[] result = Arrays.copyOfRange(arr, 0, arr.length);  // [8,6,2,0,6,4,7]
       // int[] result = new int[arr.length]; [0 0 0 0 0 ]
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    //Solution 2:
    public static int[] Sort(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }

    //Solution 3:
    public static void SortingArrayAsc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        for(int i=0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
    }



}
