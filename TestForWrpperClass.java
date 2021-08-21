package example;
import java.math.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class TestForWrpperClass {
 public static void main(String args[]){
 //System.out.println("")
   Integer intObject1 = new Integer(101);
   System.out.print(intObject1.byteValue() + " ");
   System.out.print(intObject1.intValue() + " ");
   System.out.print(intObject1.longValue() + " ");
   System.out.print(intObject1.floatValue() + " ");
   System.out.println(intObject1.doubleValue() + " ");
   Integer intObject2 = new Integer(2);
   System.out.println(intObject2.intValue());
   Integer intObject3 = new  Integer(3);
   System.out.println(intObject3.intValue());
   Integer intObject4 = new Integer(4);
   System.out.println(intObject4.intValue());
   System.out.println("-------------------------------------------");
System.out.println("Range of Integer : " + intObject2.MAX_VALUE + " TO " + intObject2.MIN_VALUE);
System.out.println("Range of Byte : " + Byte.MAX_VALUE + " TO " + Byte.MIN_VALUE);
System.out.println("Range of Short : " + Short.MAX_VALUE + " TO " + Short.MIN_VALUE);
System.out.println("Range of Long  : " + Long.MAX_VALUE + " TO " + Long.MIN_VALUE);
System.out.println("Range of Double : " + Double.MAX_VALUE + " TO " + Double.MIN_VALUE);
System.out.println("-------------------------------------------");
System.out.println(intObject1.toString());
System.out.println(intObject1.valueOf("233"));
System.out.println("-------------------------------------------");
System.out.println(Integer.parseInt("10"));
 System.out.println(Integer.parseInt("10", 10));
 System.out.println(Integer.parseInt("A", 16));
 System.out.println(Integer.parseInt("11"));
 System.out.println(Integer.parseInt("11", 10));
 System.out.println(Integer.parseInt("C", 16));
 System.out.println("-------------------------------------------");
 Integer x = new Integer(5) + new Integer(20);
 System.out.println(x);
 Integer[] intArray = {1, 2, 3};
 System.out.println(intArray[0] + intArray[1] + intArray[2]);
 System.out.println("-------------------------------------------");
 System.out.println("BigIntger and BigDecimal");
 System.out.println("-------------------------------------------");
 System.out.println("Factorial 1000 is : ");
 System.out.println(fact(10));
 System.out.println("-------------------------------------------");
 String str = new String("jayendra parmar");
 str=str.replace('p','P');
 System.out.println(str);
 str=str.replaceFirst("j","J");
 System.out.println(str);
 str=str.replaceAll(str,"JAYENDRA##PARMAR");
 System.out.println(str);
 String[] string= str.split("#");
 for(int i = 0; i < string.length; i++)
 System.out.print(string[i] + " ");
 System.out.println("I am follow goal six".replace("six","6"));
 string = "c,c++|java!python".split("[,|!]");
 for(int i = 0; i < string.length; i++)
 System.out.print(string[i] + " ");
 System.out.println("\n-------------------------------------------");
 //----------------String to char Array---------//
 char[] character = str.toCharArray();
 for(int i = 0; i < character.length; i++)
 System.out.print(character[i] + " ");
 System.out.println();
 "Arvindbhai".getChars(0,10,character,4);
 for(int i = 0; i < character.length; i++)
 System.out.print(character[i] + " ");
 System.out.println();
 String pro = new String(new char[]{'J','A','V','A'});
 System.out.println(pro);
 String str1 = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
 System.out.println(str1);
 /** String format it's similar to printf but it's not print the statement you can assign to string */
 str1 = String.format("%4d %10s %6.5f %4c",23,"java is fun",566.239,'J');
 /** printf == println(String.format) */
 System.out.println(String.format("%4d %10s %6.5f %4c",23,"java is fun",566.239,'J'));
 System.out.println("\n-------------------------------------------");
 /**-------- StringBuilder and StringBuffer-------*/
 StringBuilder stringBuilder = new StringBuilder();
stringBuilder.append("Welcome");
stringBuilder.append(' ');
stringBuilder.append("to");
stringBuilder.append(' ');
stringBuilder.append("Java");
System.out.println(stringBuilder);
 StringBuilder str2 = new StringBuilder();
 str2.append("JAYENDRA");
 str2.append(' ');
 str2.append("PARMAR");
 System.out.println(str2);
 str2.insert(15," study programming concepts");
 System.out.println(str2);
 str2.delete(15,45);
 System.out.println(str2);
// str2.deleteCharAt(9);
// System.out.println(str2);
 str2.reverse();
 System.out.println(str2);
 str2.reverse();
 str2.replace(0,8,"HARSHAD");
 System.out.println(str2);
 str2.setCharAt(0,'h');
 System.out.println(str2);
 for(int i = 0; i < str2.length() ; i++){
  System.out.print(str2.substring(i));
  System.out.println("\t\t    "+str2.substring(0,i+1));
  }
 for(int i = 0; i <= str2.length() ; i++){
  System.out.print(str2.substring(0,i));
  System.out.println("       "+str2.substring(0,str2.length()-i));
  }
 /** String Bulider length, Capacity,trim method */
  System.out.println("\n-------------------------------------------");
 System.out.println("StringBulider length : " + str2.length());
 System.out.println("StringBulider capacity : " + str2.capacity());
 str2.setLength(30);
 System.out.println("StringBulider new  length : " + str2.length());
 System.out.println("StringBulider capacity : " + str2.capacity());
 str2.trimToSize();
 System.out.println("StringBulider trim after  length : " + str2.length());
 System.out.println("StringBulider trim after capacity : " + str2.capacity());
 System.out.println("\n-------------------------------------------");
 /*
 System.out.println("Enter a String : ");
 Scanner scan = new Scanner(System.in);
 String s = scan.next();
 BigDecimal d1 = new BigDecimal(s);
 System.out.println(d1);
 BigDecimal d2 = d1.divide(d1,20,BigDecimal.ROUND_UP);
 System.out.println(d2);
 System.out.println("\n-------------------------------------------");
 */
 /** Use for Arrays.sort(Object[]) method after learn Comparable interface */
 BigInteger[] obj = {new BigInteger("100000"),new BigInteger("10000"),new BigInteger("1000"),new BigInteger("100")};
 for(int i = 0 ; i < obj.length ; i++)
  System.out.print(obj[i] + " ");
 Arrays.sort(obj);
 System.out.println();
 for(int i = 0 ; i < obj.length ; i++)
  System.out.print(obj[i] + " ");
 System.out.println();
}
public static BigInteger fact(int number){
  BigInteger num =  BigInteger.ONE;
  while(number>0){
    num =num.multiply(new BigInteger(number + ""));
    number--;
  }
  return num;
}
}