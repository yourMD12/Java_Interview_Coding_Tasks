public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Solution 1:
    public String StrReverse(String str) {

        String reverse="";
        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }

    //Solution 2
    public  static String  Reverse(String str) {
    return new StringBuffer(str).reverse().toString();
    }




}
