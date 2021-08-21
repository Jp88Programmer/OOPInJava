package example;
public class TestMyIntegerClass {
 public static void main(String args[]){
   MyInteger int1 = new MyInteger(20);
   System.out.println(int1.getValue());
   MyInteger int2 = new MyInteger(int1);
   System.out.println(int2.getValue());
   int2.valueOf(7);
   System.out.println(int2.getValue() + " is Even ? " + int2.isEven());
   System.out.println(int2.getValue() + " is Odd ? " + int2.isOdd());
   System.out.println(int2.getValue() + " is Prime ? " + int2.isPrime());
   System.out.println(int1.getValue() + " is Even ? " + int1.isEven());
   System.out.println(int1.getValue() + " is Odd ? " + int1.isOdd());
   System.out.println(int1.getValue() + " is Prime ? " + int1.isPrime());
   System.out.println(MyInteger.parseInt("25252"));
 }
}
class MyInteger{
  private int value;
 public  MyInteger(){
   this(1);
 }
 /** Const.. to assign value */
 public MyInteger(int value){
   this.value = value ;
 }
 /** args Const.. to assign MyInteger object
  or args as Object parameter */
 public MyInteger(MyInteger i1){
   this.value = i1.getValue();
 }
 public void valueOf(int val){
   value = val;
 }
 public int getValue(){
   return value ;
 }
 /** return true if data field Even */
 public boolean isEven(){
   return value % 2 == 0;
 }
 /** return true if data field Odd */
 public boolean isOdd(){
   return value % 2 != 0;
 }
 /** return true if data field Prime */
 public boolean isPrime(){
   int i;
   for( i = 2 ; i < value ; i++)
     if(value % i == 0)
      break;
   return i == value ;
 }
 /** return true if number field Even // in this method is static than use not create instance object */
 public static boolean isEven(int num){
   return num % 2 == 0;
 }
 /** return true if number field Odd */
 public static boolean isOdd(int num){
   return num % 2 != 0;
 }
 /** return true if number field Prime */
 public static boolean isPrime(int num){
   int i;
   for( i = 2 ; i < num ; i++)
     if(num % i == 0)
      break;
   return i == num ;
 }
 /** return true if MyInteger Object value is Even */
 public static boolean isEven(MyInteger i1){
   return  i1.getValue() % 2 == 0;
 }
 /** return true if MyInteger Object value is Odd */
 public static boolean isOdd(MyInteger i1){
   return i1.getValue() % 2 != 0;
 }
 /** return true if MyInteger Object value is Prime */
 public static boolean isPrime(MyInteger i1){
   int i;
   int intger = i1.getValue();
   for( i = 2 ; i < intger ; i++)
     if(intger % i == 0)
      break;
   return i == intger ;
 }
 /** instance data field to equal the any Integer of parameter */
 public boolean equals(int num){
   return value == num ;
 }
 /** instance data field to equal the MyInteger object  of parameter */
  public boolean equals(MyInteger i1){
   return value == i1.getValue() ;
 }
 /** its Convert char[]/character array to integer */
 public static int parseInt(char[] sequence){
   int num = 0;
   for(int i = 0 ; i < sequence.length ; i++){
     if(Character.isDigit(sequence[i]))
       num = num*10 + (int)sequence[i] - 48;
     else
       System.out.println("Invalid character sequence ");
   }
   return num ;
 }
 /** its Convert String to Integer and return Integer */
 public static int parseInt(String str){
   int num = 0;
   for(int i = 0 ; i < str.length() ; i++){
     if(Character.isDigit(str.charAt(i)))
       num = num*10 + (int)str.charAt(i) - 48;
     else
       System.out.println("Invalid character sequence ");
   }
   return num ;
 }
}