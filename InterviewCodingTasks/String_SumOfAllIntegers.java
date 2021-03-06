public class String_SumOfAllIntegers {

    /*
    return the sum of all integers found in the parameter String
     */

    //Solution 1:
    public static int getSumOfNumbers(String s) {
        /*
            Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

        int sum = 0;
        String[] numbers = s.replaceAll("[\\D]+"," ").split(" ");
        for(String each : numbers){
                sum+=Integer.parseInt(each);
        }
        return sum;
    }

    //Solution 2:
    public  static int  sumOfDigits(String s) {
        int total = 0;
        char[] ch =  s.toCharArray();
        for(char each: ch) {
            if(Character.isDigit(each)) {
                total += Integer.valueOf(""+each);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits("hello 2 3 5 my name is 6 3 kva"));

    }



}
