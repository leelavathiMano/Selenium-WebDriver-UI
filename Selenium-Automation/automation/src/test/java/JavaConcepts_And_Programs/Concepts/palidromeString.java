package JavaConcepts_And_Programs.Concepts;

import java.util.Scanner;

public class palidromeString {
   public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1-i;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;

            }
            i++;
            j--;
            }
        return true;

        }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String input=scan.nextLine();
        if(isPalindrome(input)){
            System.out.println("given "+input+ " is Palindrome");
        }
        else {
            System.out.println("given "+input+ " is not Palindrome");
        }

    }
}
