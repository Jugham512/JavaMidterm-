package string.problems;



public class Palindrome {

    static boolean isPalindrome(String pal) {
        int i = 0, j = pal.length() - 1;

        while (i < j){
            if (pal.charAt(i) != pal.charAt(j))
                return false;
            i++;
            j--;

        }
        return true;







    }




    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called a palindrome.
            Example: MOM, DAD, MADAM are palindromes.

            Write a method to check if a given String is a palindrome or not.
         */

        String pal = "DAD";

        if (isPalindrome(pal))
            System.out.print("Is Palindrome");
        else
            System.out.print(" Is Not Palindrome");
    }
}