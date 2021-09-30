public class Array_FirstUniqueElement {

    /*
    write a program that can find the first duplicated element from the array
     */

    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }
            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }

    public static void main(String[] args) {
        System.out.println(firstDuplicatedElement(new int[]{2, 3, 4, 4, 5, 7, 8, 9, 2, 3}));
    }


}
