package example;
import java.util.Scanner;
public class PalindromeIgnoreNonAlphanumeric {
 public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
  System.out.print("Enter a string : ");
  /**Read the String in Console */
  String str = scan.nextLine();
  System.out.println("Ignore Non Alphanumeric character ");
  System.out.println(str + " is palindrome ? " + isPalindrome(str));
 }
 /** Check String is palindrome or not */
 public static boolean isPalindrome(String str){
   /** below is Filter method to filter non-alphanumeric character */
   str = filter(str);
   /** make StringBulider as arg is String */
   StringBuilder str1 = new StringBuilder(str);
   /** StringBulider method to StringBulider is reverse */
   str1.reverse();
   /** Compare String and StringBulider but here to convert StringBuilder to String 
   than use StringBuilder.toString() method */
   return str.equals(str1.toString());   
 }
 public static String filter(String str){
   StringBuilder str1 = new StringBuilder();
   /** check Character sequencly is Letter or Digit 
   true than its insert/append empty StringBuilder one By one */
   for(int i = 0; i < str.length() ; i++){
    /** below method is stactic and included Character class */
     if( Character.isLetterOrDigit(str.charAt(i)))
     /** append one one Character in StringBuilder */
     str1.append(str.charAt(i));
   }
   /** to convert StringBuilder to String */
   return str1.toString();
 }
}
