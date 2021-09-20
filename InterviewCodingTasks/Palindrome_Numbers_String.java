public class Palindrome_Numbers_String {

    // solution for numbers
    public static void isPalindrome(int num){
        int numRev = 0;
        int temp =num;
        while(num>0){
            numRev = numRev *10 + num %10;
            num = num/10;
        }
        if(numRev==temp){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    // solution for String:
    public static void isPalindrome1(String str){
        String strReverse = new StringBuffer(str).reverse().toString();
        if(str.equals(strReverse)){
            System.out.println("its a palindrome");
        }else{
            System.out.println("it's not");
        }
    }

    public static boolean isPalindrome2(String check) {
        String rev = "";
        for(int i = check.length()-1; i >= 0; i--){
            rev +=check.charAt(i);
        }
        if(rev.replace(" ", "").equalsIgnoreCase(check.replace(" ",""))){
            return true;
        }else{
            return false;
        }
    }
}
