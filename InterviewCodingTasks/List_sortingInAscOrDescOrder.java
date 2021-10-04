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
    public void SortingArrayListDesc(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) > list.get(j)) {
                    Integer temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        // for non-static
        List_sortingInAscOrDescOrder desc = new List_sortingInAscOrDescOrder();
        desc.SortingArrayListDesc(Arrays.asList(5,9,1,3,0,4));

        // for static
        List<Integer> list = new ArrayList<>(Arrays.asList(9,3,6,4,0,7,1,6));
        List<Integer> ascList = SortingArrayListAsc(list);
        System.out.println(ascList);

    }
}
