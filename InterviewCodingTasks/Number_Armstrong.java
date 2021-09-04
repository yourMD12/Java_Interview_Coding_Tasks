public class Number_Armstrong {

    /*
    Write a method that can check if a number is Armstrong number
     */

    // solution 1:
    public boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;
        while (num > 0) {
            a = num % 10;
            num /= 10;
            b = b + (a * a * a);
        }
        return (c == b) ? true : false;
    }

    //solution 2:
    public static boolean isArmstrong(int num) {

        String strNum = "" + num;
        int power = strNum.length();
        int sum = 0;
        for(int i=0; i < strNum.length(); i++) {
            //  int temp = 1;
            int eachDigit = Integer.parseInt(strNum.substring(i, i+1));
            sum += Math.pow(eachDigit, power);  // 1 ^ 3 = 1 * 1 * 1
        }
        return num == sum;
    }

}
