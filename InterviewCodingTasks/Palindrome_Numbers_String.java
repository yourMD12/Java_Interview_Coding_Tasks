public class Palindrome_Numbers_String {
    public static void main(String[] args) {
    }

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

    // solution for String
    public static boolean isPalindrome(String check) {
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
