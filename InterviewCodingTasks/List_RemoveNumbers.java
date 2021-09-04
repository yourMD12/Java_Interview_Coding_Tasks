import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */


    // solution 1
    public List<Integer> remove1(List<Integer> list){

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()){
            if(it.next()>100){
                it.remove();
            }
        }
        return list;
    }

    // solution 2
    public List<Integer> remove2(List<Integer> list){
        list.removeIf(number -> number > 100);
        return list;
    }

    // solution 3:
    public List<Integer> remove3(List<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int  each : list) {
            if (each < 100) {
                list2.add(each);
            }
            list = list2;
        }
       return list;
    }



}
