import java.util.ArrayList;
import java.util.Arrays;

public class Array_SortInDescendingOrder {

    /*
        Write a return method that can sort an int array in descending order without using the sort method
        Ex:  int[] arr = {10,20,7, 8, 90};
             arr = Sort(arr);  ==>  {90, 20, 10, 8, 7};

     */

    //Solution 1:
    public int[] sortingArrayAsc(int[] arr) {

        int[] result = Arrays.copyOfRange(arr, 0, arr.length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] > result[j]) {
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
            a[i] = findMax(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public static int findMax(ArrayList<Integer> a) {
        int max=Integer.MIN_VALUE;
        for(int each: a)
            max = Math.max(max, each);
        return max;
    }

    //Solution 3:
    public static void SortingArrayDesc(int[] arr) {
        ArrayList<Integer> list = new ArrayList();
        for(int each: arr) {
            list.add(each);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
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
