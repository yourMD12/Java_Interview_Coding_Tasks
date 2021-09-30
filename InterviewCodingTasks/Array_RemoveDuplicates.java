import java.util.*;

public class Array_RemoveDuplicates {

    /*
    Write a function that can remove the duplicates from an array of integers
     */


    // solution 1
    public static int[] removeDuplicates(int[] array){

        return Arrays.stream(array).distinct().toArray();
    }


    //solution 2
    public static int[] removeDuplicates2(int[] array){
        ArrayList<Integer> list = new ArrayList<>(); // [0]
        for(int each: array){
            if(!list.contains(each)){
                list.add(each); // [1,2,3,4,5]
            }
        }
        array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

//    // solution 3
//    public static int[] removeDuplicates3(int[] array){
//        Set<Integer> set = new LinkedHashSet<>();
//        for(int each : array){
//            set.add(each);
//        }
//        array = new int[set.size()];
//        for (int i = 0; i < set.size(); i++) {
//            array[i] = set.add(i);
//        }
//        return array;
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates2(new int[]{1, 2, 3, 4, 3, 2, 1, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new int[]{9,5,3,8,6,9,5,3,1})));
    }



}
