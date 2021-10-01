import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_sortingInAscOrDescOrder {

    // Write a method that can sort the ArrayList in Ascending/descending order without using the sort method

    //asc
    public static List<Integer> SortingArrayListAsc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    //desc
    public static void SortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

    }

    public static void main(String[] args) {
        SortingArrayListAsc(Arrays.asList(2,5,8,1,9,5,2,6));

    }
}
